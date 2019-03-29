package com.libraryWS.contract.manager;

import com.libraryWS.beans.Book;
import com.libraryWS.beans.BookType;

import java.util.List;

public interface BookManager {

    public List<Book> getAllBook();
    public Book getBookByTitle(String title);
    public List<Book> getBookByAuthorName(String authorName);
    public List<Book> getBookByBookType(BookType bookType);
    public Book getBookByTitleAuthorNameBookType(String title, String authorName, BookType BookType);

}
