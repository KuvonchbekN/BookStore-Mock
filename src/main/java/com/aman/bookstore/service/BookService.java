package com.aman.bookstore.service;

import com.aman.bookstore.dataLayer.entity.Book;
import com.aman.bookstore.dataLayer.entity.BookGenre;
import com.aman.bookstore.dataLayer.repo.BookRepository;

import java.util.List;

public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public List<Book> getBooksOfGenre(BookGenre bookGenre){
         return bookRepository.getBooksOfGenre(bookGenre);
    }

    public List<Book> searchBookByTitle(String title){
        return bookRepository.searchBookByTitle(title);
    }

    public List<Book> searchBooksByAuthorName(String bookAuthorName){
        return bookRepository.searchBooksByAuthorName(bookAuthorName);
    }

}
