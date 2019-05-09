package com.libraryWS.service.book;

import java.util.List;

import com.libraryWS.entity.Book;

public interface BookManager {

    public List<Book> getAllBook();
    public Book getBookByTitle(String title);
    
    public Book getBookById(Integer idBook);
    
    public List<Book> getBookByAuthorName(String authorName);
    public List<Book> getBookByTitleAndAuthorName(String title, String authorName);

    public List<Book> getBookByBookType(String bookType);

}
