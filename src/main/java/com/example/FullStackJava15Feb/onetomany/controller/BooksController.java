package com.example.FullStackJava15Feb.onetomany.controller;

import com.example.FullStackJava15Feb.onetomany.domain.Books;
import com.example.FullStackJava15Feb.onetomany.domain.Pages;
import com.example.FullStackJava15Feb.onetomany.repository.BooksRepository;
import com.example.FullStackJava15Feb.onetomany.repository.PagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class BooksController {


    @Autowired
    private BooksRepository booksRepository;

    @Autowired
    private PagesRepository pagesRepository;


    @GetMapping(value = "/saveBooks")
    public String saveBooks(){
        Books books = new Books();
        Set<Pages> pages = new HashSet<>();


        Pages pages1 = new Pages();
        Pages pages2 = new Pages();

        books.setName("Java Black Book");
        books.setAuthor("James");

        pages1.setNumber(100);
        pages1.setChapter("Introduction");
        pages1.setBooks(books);
        pages2.setNumber(200);
        pages2.setChapter("Java OOP");
        pages2.setBooks(books);

        books.setPages(pages);
        booksRepository.save(books);
        pagesRepository.save(pages1);
        pagesRepository.save(pages2);

        return "Saved data";
    }


    @GetMapping(value = "/getBooks")
    public List<Books> getBooks(){
        return booksRepository.findAll();
    }

}
