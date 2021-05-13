package com.example.FullStackJava15Feb.onetomany.repository;

import com.example.FullStackJava15Feb.onetomany.domain.Pages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagesRepository extends JpaRepository<Pages,Integer> {
}
