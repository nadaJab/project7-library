package com.libraryWS.repository;

import com.libraryWS.beans.Book;
import com.libraryWS.beans.BookType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findByTitle(String title);
    List<Book> findByAuthorName(String name);
    List<Book> findByBookType(BookType type);
    Book findByTitleAuthorNameBookType(String title, String name, BookType type);
}
