package com.example.books;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

    @GetMapping("/books")
    public Book books(){
        return new Book(1, "One", "Title");
    }
}
