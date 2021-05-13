package com.example.FullStackJava15Feb.onetomany.repository;

import com.example.FullStackJava15Feb.onetomany.domain.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books,Integer> {
}
