package com.libraryWS.contract.manager;

import com.libraryWS.beans.Book;

import java.util.ArrayList;

public interface BookManager {

    ArrayList<Book> getAllBook();

    Book getBook(String title, String authorName, String BookType);

}
