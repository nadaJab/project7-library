package com.libraryWS.service.borrowingBook;

import com.libraryWS.entity.Book;
import com.libraryWS.entity.BorrowingBook;
import com.libraryWS.entity.User;

public interface BorrowingBookManager {
	
	 public BorrowingBook getBorrowingBookById(Integer id);
	 public BorrowingBook getByUserAndBook(User user, Book book);
	 public BorrowingBook saveBorrowing(BorrowingBook bb);
	 public BorrowingBook getBorrowingBookByBookAndUser(Book book, User user);
}
