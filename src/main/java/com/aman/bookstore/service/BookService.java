package com.aman.bookstore.service;

import com.aman.bookstore.dataLayer.entity.Book;
import com.aman.bookstore.dataLayer.entity.BookGenre;
import com.aman.bookstore.dataLayer.repo.BookRepository;

import java.util.List;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
        return null;
    }

    public List<Book> getBooksOfGenre(BookGenre bookGenre){
        return null;
    }

    public List<Book> searchBookByTitle(String title){
        return null;
    }

    public List<Book> searchBooksByAuthorName(String bookAuthorName){
        return null;
    }

}
