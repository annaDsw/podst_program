package com.example.learn.semester2.lombok;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BookWithLombok {
    private String name;
    private String author;
    private int price;
    private String genre;
    private int publicationYear;
    private String publishingHouse;
    private int numberOfPages;
}
