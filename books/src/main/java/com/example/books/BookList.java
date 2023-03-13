package com.example.books;

import java.util.List;
import java.util.ArrayList;

public class BookList {
    private final List<Book> bookList;

    public BookList(){
        this.bookList = new ArrayList<Book>(); {
            new Book(1,"fds","fds");
            new Book(2,"fds","fds");
            new Book(3,"fds","fds");
        };
    }

    public List<Book> getBookList() {
        return this.bookList;
    }
}
