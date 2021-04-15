package com.findisaac.mongospring.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Book
 * <br>
 * <code>com.findisaac.mongospring.model.Book</code>
 * <br>
 *
 * @author Isaac Aderonmu
 * @since 15 April 2021
 */
@Getter
@Setter
@ToString
@Document(collection = "Book")
public class Book {

    private int id;
    private String bookName;
}
