package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository repository;

    // Setter for Spring to inject dependency
    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public void printBook(int id) {
        String title = repository.getBookTitleById(id);
        System.out.println("Book [" + id + "]: " + title);
    }
}
