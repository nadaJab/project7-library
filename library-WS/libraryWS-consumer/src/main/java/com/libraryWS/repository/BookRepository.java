package com.libraryWS.repository;

import com.libraryWS.beans.Book;
import com.libraryWS.beans.BookType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

    Book findByTitle(String title);
    List<Book> findByAuthorName(String name);
    List<Book> findByBookType(BookType type);
    Book findByTitleAuthorNameBookType(String title, String name, BookType type);
}
