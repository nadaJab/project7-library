package com.libraryWS.impl;

import org.springframework.stereotype.Component;
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
