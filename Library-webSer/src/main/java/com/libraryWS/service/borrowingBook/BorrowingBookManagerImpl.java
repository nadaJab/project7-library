package com.libraryWS.service.borrowingBook;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.libraryWS.entity.Book;
import com.libraryWS.entity.BorrowingBook;
import com.libraryWS.entity.User;
import com.libraryWS.repository.BorrowingBookRepository;

@Service
@Transactional
@Qualifier("borrowingBookManager")
public class BorrowingBookManagerImpl implements BorrowingBookManager{

	
	@Autowired
	private BorrowingBookRepository borrowingBookRepository;
	
	@Override
	public BorrowingBook getBorrowingBookById(Integer idBorrowingBook) {
		
		Optional<BorrowingBook> borrowingBook = borrowingBookRepository.findById(idBorrowingBook);
		BorrowingBook borrowing = borrowingBook.get();
		
		return borrowing;
	}

	@Override
	public BorrowingBook getByUserAndBook(User user, Book book) {
		BorrowingBook borrowingBook = borrowingBookRepository.findByUserAndBook(user, book); 
		return borrowingBook;
	}

	@Override
	public BorrowingBook saveBorrowing(BorrowingBook bb) {
		
		 try {
			return this.borrowingBookRepository.save(bb);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		 
	}

	@Override
	public BorrowingBook getBorrowingBookByBookAndUser(Book book, User user) {
		BorrowingBook borrowingBook = borrowingBookRepository.findByBookAndUser(book, user);
		return borrowingBook;
	}

}
