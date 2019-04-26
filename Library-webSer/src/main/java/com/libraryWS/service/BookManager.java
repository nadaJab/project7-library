package com.libraryWS.service;

import java.util.List;

import com.libraryWS.entity.Book;

public interface BookManager {

    public List<Book> getAllBook();
    public Book getBookByTitle(String title);
    public List<Book> getBookByAuthorName(String authorName);
    public List<Book> getBookByBookType(String bookType);

}
