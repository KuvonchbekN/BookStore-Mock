package com.aman.bookstore.dataLayer.impl;

import com.aman.bookstore.dataLayer.entity.Book;
import com.aman.bookstore.dataLayer.entity.ID;
import com.aman.bookstore.dataLayer.repo.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class BookRepoImpl implements BookRepository {

    List<Book> books = new ArrayList<>();

    @Override
    public Book save(Book book) {
        books.add(book);
        return book;
    }

    @Override
    public void delete(Book book) {
        books.remove(book);
    }

    @Override
    public Book findById(ID id) {
        for (Book book : books) {
            if (book.id.id == id.id)
                return book;
        }
        return null;
    }

    @Override
    public List<Book> findAll() {
        return books;
    }
}
