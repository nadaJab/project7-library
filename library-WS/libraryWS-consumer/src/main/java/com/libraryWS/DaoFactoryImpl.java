package com.libraryWS;

import com.libraryWS.repository.*;
import org.springframework.beans.factory.annotation.Autowired;

public class DaoFactoryImpl {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BorrowingBookRepository borrowingBookRepository;

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public AuthorRepository getAuthorRepository() {
        return authorRepository;
    }

    public void setAuthorRepository(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public BorrowingBookRepository getBorrowingBookRepository() {
        return borrowingBookRepository;
    }

    public void setBorrowingBookRepository(BorrowingBookRepository borrowingBookRepository) {
        this.borrowingBookRepository = borrowingBookRepository;
    }
}
