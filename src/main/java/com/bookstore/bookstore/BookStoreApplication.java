package com.bookstore.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.print.Book;

@SpringBootApplication
public class BookStoreApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BookStoreApplication.class, args);
        BookRepository bookRepository = context.getBean(BookRepository.class);


    }

}
