package com.libraryWS.repository;

import com.libraryWS.beans.BorrowingBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowingBookRepository extends JpaRepository<BorrowingBook, Integer> {
}
