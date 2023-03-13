package com.example.books;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {

    @GetMapping("/books")
    public List<Book> books(){
        return List.of(new Book(1,"fds","fds"),
        new Book(2,"fds","fds"),
        new Book(3,"fds","fds"));
    }
}
