package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository repository;

    // Spring will call this setter to inject the repository bean
    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public void printBook(int id) {
        String title = repository.getBookTitleById(id);
        System.out.println("Book [" + id + "]: " + title);
    }
}
