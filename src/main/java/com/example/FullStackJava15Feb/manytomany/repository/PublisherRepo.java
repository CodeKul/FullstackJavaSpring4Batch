package com.example.FullStackJava15Feb.manytomany.repository;

import com.example.FullStackJava15Feb.manytomany.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepo extends JpaRepository<Publisher,Integer> {
}
