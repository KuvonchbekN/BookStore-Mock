package com.aman.bookstore.dataLayer.daos;

public interface Persistable <T> {
    T save(T t);
}
