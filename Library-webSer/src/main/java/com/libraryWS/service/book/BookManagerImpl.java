package com.libraryWS.service.book;

import com.libraryWS.entity.Book;
import com.libraryWS.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@Qualifier("bookManager")
public class BookManagerImpl implements BookManager {

	@Autowired
    private BookRepository bookRepository;
	 
    @Override
    public List<Book> getAllBook() {
        List < Book > list = new ArrayList < > ();
        bookRepository.findAll().forEach(e -> list.add(e));
        
        return list;
    }

    @Override
    public Book getBookByTitle(String title)
    {
        Book book = new Book();
        book = bookRepository.findByTitleContaining(title);
        return book;
    }

    /**
     * 
     * 
     */
    @Override
    public List<Book> getBookByAuthorName(String authorName) {
        List<Book> list = bookRepository.findByAuthorNameContaining(authorName);
        return list;
    }

    @Override
	public List<Book> getBookByTitleAndAuthorName(String title, String authorName) {
    	List<Book> list = bookRepository.findByTitleContainingAndAuthorNameContaining(title, authorName);
		return list;
	}
    
    @Override
    public List<Book> getBookByBookType(String bookType) {
        List<Book> list = bookRepository.findByBookType(bookType);
        return list;
    }

	public BookRepository getBookRepository() {
		return bookRepository;
	}

	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public Book getBookById(Integer idBook) {
		//Book book = manager.find(Book.class, idBook);
		Optional<Book> book = bookRepository.findById(idBook);
		
		Book booka = book.get();
		return booka;
	}
}
