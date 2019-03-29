package com.libraryWS.impl.manager;

import com.libraryWS.beans.Book;
import com.libraryWS.beans.BookType;
import com.libraryWS.contract.manager.BookManager;
import com.libraryWS.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.libraryWS.impl.AbstractManagerImpl;

import java.util.ArrayList;
import java.util.List;

@Component("bookManager")
public class BookManagerImpl extends AbstractManagerImpl implements BookManager {

    /*
    @Autowired
    private BookRepository bookRepository; */

    private List<Book> list = new ArrayList<>();

    @Override
    public List<Book> getAllBook() {
        list = getDaoFactory().getBookRepository().findAll();
        //getDaoFactory().getBookRepository().findAll().forEach(e -> list.add(e));
        return list;
    }

    @Override
    public Book getBookByTitle(String title) {
        return getDaoFactory().getBookRepository().findByTitle(title);
    }

    @Override
    public List<Book> getBookByAuthorName(String authorName) {
        list = getDaoFactory().getBookRepository().findByAuthorName(authorName);
        return list;
    }

    @Override
    public List<Book> getBookByBookType(BookType bookType) {
        list = getDaoFactory().getBookRepository().findByBookType(bookType);
        return list;
    }

    @Override
    public Book getBookByTitleAuthorNameBookType(String title, String authorName, BookType bookType) {
        return getDaoFactory().getBookRepository().findByTitleAuthorNameBookType(title, authorName, bookType);
    }
}
