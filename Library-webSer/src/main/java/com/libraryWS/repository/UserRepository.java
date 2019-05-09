package com.libraryWS.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libraryWS.entity.Book;
import com.libraryWS.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	     
	 User findByEmailAndPassword(String email, String pass);
	 User findByLastNameAndEmail(String name, String email);
	 User findByEmail(String email);
}
