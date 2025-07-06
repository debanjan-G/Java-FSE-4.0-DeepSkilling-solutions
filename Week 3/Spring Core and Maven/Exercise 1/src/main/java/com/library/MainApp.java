package com.library;

import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("[Ex1] Context loaded, beans instantiated!");

        // manually wire dependency in Java
        BookRepository repo = ctx.getBean("bookRepository", BookRepository.class);
        BookService    svc  = ctx.getBean("bookService",    BookService.class);
        svc.setRepository(repo);

        svc.printBook(1);
    }
}
