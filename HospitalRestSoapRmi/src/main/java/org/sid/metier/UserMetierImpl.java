package org.sid.metier;

import org.sid.dao.UserRepository;
import org.sid.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMetierImpl implements UserMetier {
	@Autowired
	private UserRepository userRepository;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public void deleteUser(User user) {
		userRepository.delete(user);

	}

	public String login(String username, String password) {
		User user = userRepository.findByUsername(username);
		if (user != null && (user.getPassword().toString() == password)) {
			return "ok";
		} else
			return user.getPassword().toString();

	}
}
