package com.learn.learnJPA.bootstrap;

import com.learn.learnJPA.model.Book;
import com.learn.learnJPA.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Book bookDDD = new Book("Domain Driven Design", "123", "RandomHouse");
        System.out.println("Before saved BookDDD id : " + bookDDD.getId());
        Book savedDDD = bookRepository.save(bookDDD);
        System.out.println("After saved BookDDD id : " + bookDDD.getId());


        Book bookSIA = new Book("Spring in Action", "321", "Orilley");
        System.out.println("Before saved BookSIA id : " + bookSIA.getId());
        Book savedSIA = bookRepository.save(bookSIA);
        System.out.println("After saved BookSIA id : " + bookSIA.getId());

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book id: " + book.getId());
            System.out.println("Book title: " + book.getTitle());
        });


    }
}
