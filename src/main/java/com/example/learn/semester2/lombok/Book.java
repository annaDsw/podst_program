package com.example.learn.semester2.lombok;

public class Book {
    private String name;
    private String author;
    private int price;
    private String genre;
    private int publicationYear;
    private String publishingHouse;
    private int numberOfPages;

    public Book(String name, String author, int price, String genre, int publicationYear, String publishingHouse, int numberOfPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.genre = genre;
        this.publicationYear = publicationYear;
        this.publishingHouse = publishingHouse;
        this.numberOfPages = numberOfPages;
    }

    public Book() {
    }

    public Book(String name, int price, String genre) {
        this.name = name;
        this.price = price;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (price != book.price) return false;
        if (publicationYear != book.publicationYear) return false;
        if (numberOfPages != book.numberOfPages) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        if (genre != null ? !genre.equals(book.genre) : book.genre != null) return false;
        return publishingHouse != null ? publishingHouse.equals(book.publishingHouse) : book.publishingHouse == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + publicationYear;
        result = 31 * result + (publishingHouse != null ? publishingHouse.hashCode() : 0);
        result = 31 * result + numberOfPages;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                ", publicationYear=" + publicationYear +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
