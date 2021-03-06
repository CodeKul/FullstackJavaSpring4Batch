package com.example.FullStackJava15Feb.manytomany.controller;

import com.example.FullStackJava15Feb.manytomany.domain.Book;
import com.example.FullStackJava15Feb.manytomany.domain.Publisher;
import com.example.FullStackJava15Feb.manytomany.repository.BookRepo;
import com.example.FullStackJava15Feb.manytomany.repository.PublisherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class BookController {

    @Autowired
    BookRepo bookRepo;

    @GetMapping(value = "saveBook")
    public String saveBook(){

        Book book =
                new Book("Book1",
                        new Publisher("Publisher1"),
                        new Publisher("Publisher2"),
                        new Publisher("Publisher3"));

        bookRepo.save(book);
        return "saved...";
    }

    @GetMapping(value = "getBooksAndPublisher")
    public List<Book> getBook(){
        return bookRepo.findAll();
    }
}
