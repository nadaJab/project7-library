package com.libraryWS.service.user;

import com.libraryWS.entity.User;

public interface UserManager {
	
	public User addUser(User user);
	public User getUserByEmailAndPassword(String email, String password);
	public User getUserByLastNameAndEmail(String name, String email);
	public User getUserByEmail(String email);

}
