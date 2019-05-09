package com.libraryWS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libraryWS.entity.Book;
import com.libraryWS.entity.BorrowingBook;
import com.libraryWS.entity.User;

@Repository
public interface BorrowingBookRepository extends JpaRepository<BorrowingBook, Integer>{
	
	BorrowingBook findByUserAndBook(User user, Book book);
	
	BorrowingBook findByBookAndUser(Book book, User user);
}
