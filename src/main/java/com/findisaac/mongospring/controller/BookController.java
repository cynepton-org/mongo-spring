package com.findisaac.mongospring.controller;

import com.findisaac.mongospring.model.Book;
import com.findisaac.mongospring.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * BookController
 * <br>
 * <code>com.findisaac.mongospring.controller.BookController</code>
 * <br>
 *
 * @author Isaac Aderonmu
 * @since 15 April 2021
 */
@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("book")
    private String postBook(@RequestBody Book book) {
        bookRepository.save(book);
        return "added book with id: " + book.getId();
    }

    @GetMapping("book")
    private List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
