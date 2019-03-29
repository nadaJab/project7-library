package com.libraryWS.impl;

import com.libraryWS.DaoFactoryImpl;

import javax.inject.Inject;
import javax.inject.Named;

public class AbstractManagerImpl {

    @Inject
    @Named("daoFactory")
    protected DaoFactoryImpl daoFactory;

    protected DaoFactoryImpl getDaoFactory() {
        return daoFactory;
    }

    public void setDaoFactory(DaoFactoryImpl daoFactory) {
        this.daoFactory=daoFactory;
    }
}
