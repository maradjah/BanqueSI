package org.sid.services;

import org.sid.entities.User;
import org.sid.metier.UserMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestService {

	@Autowired
	private UserMetier userMetier;

	public User saveUser(User user) {
		return userMetier.saveUser(user);
	}

	public void deleteUser(User user) {
		userMetier.deleteUser(user);
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@RequestParam String username,
			@RequestParam String password) {
		return userMetier.login(username, password);
	}

}
