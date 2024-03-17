package com.learn.learnJPA.repositories;

import com.learn.learnJPA.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
