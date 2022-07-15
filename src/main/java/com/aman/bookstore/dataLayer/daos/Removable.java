package com.aman.bookstore.dataLayer.daos;

public interface Removable<T> {
    void delete(T t);
}
