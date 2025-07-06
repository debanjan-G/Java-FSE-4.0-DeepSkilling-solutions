package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository repository;

    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public void printBook(int id) {
        System.out.println("Book [" + id + "]: " + repository.getBookTitleById(id));
    }
}
