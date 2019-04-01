package com.libraryWS.impl;

import com.libraryWS.beans.User;
import com.libraryWS.contract.ManagerFactory;
import com.libraryWS.contract.manager.AuthorManager;
import com.libraryWS.contract.manager.BookManager;
import com.libraryWS.contract.manager.BorrowingBookManager;
import com.libraryWS.contract.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("managerFactory")
public class ManagerFactoryImpl implements ManagerFactory {

    @Autowired
    private UserManager userManager;
    @Autowired
    private BookManager bookManager;
/*
    @Autowired
    private  AuthorManager authorManager;
    @Autowired
    private BorrowingBookManager borrowingBookManager; */

    public UserManager getUserManager(){
        return this.userManager;
    }

    public BookManager getBookManager() {
        return this.bookManager;
    }
/*
    public AuthorManager getAuthorManager() {
        return this.authorManager;
    }

    public BorrowingBookManager getBorrowingBookManager(){
        return this.borrowingBookManager;
} */

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public void setBookManager(BookManager bookManager) {
        this.bookManager = bookManager;
    }
/*
    public void setAuthorManager(AuthorManager authorManager) {
        this.authorManager = authorManager;
    }

    public void setBorrowingBookManager(BorrowingBookManager borrowingBookManager) {
        this.borrowingBookManager = borrowingBookManager;
    } */
}
