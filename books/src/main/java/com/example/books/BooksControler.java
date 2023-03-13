package com.example.books;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksControler {

    @GetMapping("/books")
    public String books(@RequestParam(value="id")){

    }
}
