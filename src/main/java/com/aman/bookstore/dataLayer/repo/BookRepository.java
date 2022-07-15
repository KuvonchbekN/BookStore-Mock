package com.aman.bookstore.dataLayer.repo;

import com.aman.bookstore.dataLayer.daos.Persistable;
import com.aman.bookstore.dataLayer.daos.Removable;
import com.aman.bookstore.dataLayer.daos.Searchable;
import com.aman.bookstore.dataLayer.entity.Book;
import com.aman.bookstore.dataLayer.entity.BookGenre;

import java.util.List;


public interface BookRepository extends Persistable<Book>, Searchable<Book>, Removable<Book> {
    List<Book> getBooksOfGenre(BookGenre bookGenre);

    List<Book> searchBookByTitle(String title);

    List<Book> searchBooksByAuthorName(String bookAuthorName);
}
