package com.aman.bookstore.dataLayer.entity;

public class Book {
    public ID id;
    public String title;
    public String bookAuthorName;
    public BookGenre bookGenre;

    public Book(ID id, String title, String bookAuthorName, BookGenre bookGenre) {
        this.id = id;
        this.title = title;
        this.bookAuthorName = bookAuthorName;
        this.bookGenre = bookGenre;
    }
}
