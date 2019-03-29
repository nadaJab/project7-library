package com.libraryWS.repository;

import com.libraryWS.beans.Book;
import com.libraryWS.beans.BookType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findByTitle(String title);
    List<Book> findByAuthorName(String name);
    List<Book> findByBookType(BookType type);
    Book findByTitleAuthorNameBookType(String title, String name, BookType type);
}
