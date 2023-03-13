package com.example.books;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {

    @GetMapping("/books")
    public List<Book> books(){
        BookList bookList = new BookList();
        return bookList.getBookList();
    }
}
