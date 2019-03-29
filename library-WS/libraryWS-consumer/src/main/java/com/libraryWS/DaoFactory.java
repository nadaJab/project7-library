package com.libraryWS;
import com.libraryWS.repository.*;

public interface DaoFactory {

    UserRepository getUserRepository();
    BookRepository getBookRepository();
    AuthorRepository getAuthorRepository();
    BorrowingBookRepository getBorrowingBookRepository();
}
