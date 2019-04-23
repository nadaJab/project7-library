package com.libraryWS.impl.manager;

import com.libraryWS.beans.Book;
import com.libraryWS.beans.BookType;
import com.libraryWS.contract.manager.BookManager;
import com.libraryWS.repository.BookRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service(value = "bookManager")
@Transactional
@Component
public class BookManagerImpl implements BookManager {


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
        return bookRepository.findByTitle(title);
    }

    @Override
    public List<Book> getBookByAuthorName(String authorName) {
        List<Book> list = bookRepository.findByAuthorName(authorName);
        return list;
    }

    @Override
    public List<Book> getBookByBookType(BookType bookType) {
        List<Book> list = bookRepository.findByBookType(bookType);
        return list;
    }

    @Override
    public Book getBookByTitleAuthorNameBookType(String title, String authorName, BookType bookType) {
        return bookRepository.findByTitleAuthorNameBookType(title, authorName, bookType);
    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
