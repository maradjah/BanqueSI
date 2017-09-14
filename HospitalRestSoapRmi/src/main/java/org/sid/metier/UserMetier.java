package org.sid.metier;

import org.sid.entities.User;

public interface UserMetier {

	public User saveUser(User user);

	public void deleteUser(User user);

	public String login(String username, String password);

}
