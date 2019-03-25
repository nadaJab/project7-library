package com.libraryWS.contract;
import com.libraryWS.contract.dao.*;

public interface DaoFactory {

    UserDao getUserDao();
    BookDao getBookDao();
    AuthorDao getAuthorDao();
    BorrowingBookDao getBorrowingBookDao();
}
