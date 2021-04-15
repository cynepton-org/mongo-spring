package com.findisaac.mongospring.repository;

import com.findisaac.mongospring.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * BookRepository
 * <br>
 * <code>com.findisaac.mongospring.repository.BookRepository</code>
 * <br>
 *
 * @author Isaac Aderonmu
 * @since 15 April 2021
 */
public interface BookRepository extends MongoRepository<Book, Integer> {
}
