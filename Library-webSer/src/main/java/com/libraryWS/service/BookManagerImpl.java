package com.libraryWS.service;

import com.libraryWS.entity.Book;
import com.libraryWS.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@Qualifier("bookManager")
public class BookManagerImpl implements BookManager {

	@Autowired
    private BookRepository bookRepository;

    //private List<Book> list = new ArrayList<>();

    @Override
    public List<Book> getAllBook() {
        List < Book > list = new ArrayList < > ();
        bookRepository.findAll().forEach(e -> list.add(e));
        //List<Book> list = bookRepository.findAll();
        //getDaoFactory().getBookRepository().findAll().forEach(e -> list.add(e));
        return list;
    }

    @Override
    public Book getBookByTitle(String title)
    {
        Book book = new Book();
        book = bookRepository.findByTitle(title);
        System.out.println(book.toString());
        return book;
    }

    @Override
    public List<Book> getBookByAuthorName(String authorName) {
        List<Book> list = bookRepository.findByAuthorName(authorName);
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
    
    

}
