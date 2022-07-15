package com.aman.bookstore.dataLayer.repo;

import com.aman.bookstore.dataLayer.daos.Persistable;
import com.aman.bookstore.dataLayer.daos.Removable;
import com.aman.bookstore.dataLayer.daos.Searchable;
import com.aman.bookstore.dataLayer.entity.Book;


public interface BookRepository extends Persistable<Book>, Searchable<Book>, Removable<Book> {
}
