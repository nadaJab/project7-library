package com.libraryWS.service.user;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.libraryWS.entity.User;
import com.libraryWS.repository.BookRepository;
import com.libraryWS.repository.UserRepository;

@Service
@Transactional
@Qualifier("userManager")
public class UserManagerImpl implements UserManager{

	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user) {
		try {
			return this.userRepository.save(user);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public User getUserByEmailAndPassword(String email, String pass) {
		try {

			User user = userRepository.findByEmailAndPassword(email, pass);
			return user;			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public User getUserByLastNameAndEmail(String name, String email) {

		return this.userRepository.findByLastNameAndEmail(name, email);
	}

	@Override
	public User getUserByEmail(String email) {
		try {

			User user = userRepository.findByEmail(email);
			return user;			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
