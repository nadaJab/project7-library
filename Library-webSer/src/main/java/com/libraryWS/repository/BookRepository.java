package com.libraryWS.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.libraryWS.entity.Book;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
		
    Book findByTitleContaining(String title);
      
    List<Book> findByAuthorNameContaining(String name);

    List<Book> findByTitleContainingAndAuthorNameContaining(String title, String name);

    List<Book> findByBookType(String type);
}
