package com.libraryWS.impl;

import com.libraryWS.contract.dao.AuthorDao;
import com.libraryWS.contract.dao.BookDao;
import com.libraryWS.contract.dao.BorrowingBookDao;
import com.libraryWS.contract.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

public class DaoFactoryImpl {

    @Autowired
    private UserDao userDao;
    @Autowired
    private BookDao bookDao;
    @Autowired
    private AuthorDao authorDao;
    @Autowired
    private BorrowingBookDao borrowingBookDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public AuthorDao getAuthorDao() {
        return authorDao;
    }

    public void setAuthorDao(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    public BorrowingBookDao getBorrowingBookDao() {
        return borrowingBookDao;
    }

    public void setBorrowingBookDao(BorrowingBookDao borrowingBookDao) {
        this.borrowingBookDao = borrowingBookDao;
    }
}
