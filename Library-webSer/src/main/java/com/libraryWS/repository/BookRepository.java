package com.libraryWS.repository;

import org.springframework.stereotype.Repository;

import com.libraryWS.entity.Book;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

    Book findByTitle(String title);
    List<Book> findByAuthorName(String name);
    List<Book> findByBookType(String type);
}
