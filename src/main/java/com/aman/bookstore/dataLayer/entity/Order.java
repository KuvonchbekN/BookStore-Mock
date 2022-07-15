package com.aman.bookstore.dataLayer.entity;

import java.util.Date;

public class Order {
    public ID id;
    public Book book;
    public User customer;
    public Date datetime;

    public Order(ID id, Book book, User customer, Date datetime) {
        this.id = id;
        this.book = book;
        this.customer = customer;
        this.datetime = datetime;
    }
}
