package com.aman.bookstore.dataLayer.daos;

import com.aman.bookstore.dataLayer.entity.ID;

import java.util.List;

public interface Searchable <T>{
    T findById(ID id);
    List<T> findAll();
}
