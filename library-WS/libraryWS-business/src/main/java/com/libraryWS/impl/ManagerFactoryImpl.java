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
    private BookManager bookManager;

    @Override
    public BookManager getBookManager() {
        return bookManager;
    }

    public void setBookManager(BookManager bookManager) {
        this.bookManager = bookManager;
    }
}