package com.libraryWS.impl.manager;

import com.libraryWS.beans.Book;
import com.libraryWS.beans.BookType;
import com.libraryWS.contract.manager.BookManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.libraryWS.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

@Component("bookManager")
public class BookManagerImpl implements BookManager {

    private BookRepository bookRepository;

    private List<Book> list = new ArrayList<>();

    @Override
    public List<Book> getAllBook() {
        list = bookRepository.findAll();
        //getDaoFactory().getBookRepository().findAll().forEach(e -> list.add(e));
        return list;
    }

    @Override
    public Book getBookByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    @Override
    public List<Book> getBookByAuthorName(String authorName) {
        list = bookRepository.findByAuthorName(authorName);
        return list;
    }

    @Override
    public List<Book> getBookByBookType(BookType bookType) {
        list = bookRepository.findByBookType(bookType);
        return list;
    }

    @Override
    public Book getBookByTitleAuthorNameBookType(String title, String authorName, BookType bookType) {
        return bookRepository.findByTitleAuthorNameBookType(title, authorName, bookType);
    }
}
