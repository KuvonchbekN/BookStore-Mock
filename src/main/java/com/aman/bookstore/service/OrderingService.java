package com.aman.bookstore.service;

import com.aman.bookstore.dataLayer.entity.Book;
import com.aman.bookstore.dataLayer.entity.Order;
import com.aman.bookstore.dataLayer.entity.User;
import com.aman.bookstore.dataLayer.repo.OrderRepository;

import java.util.List;

public class OrderingService {
    private OrderRepository orderRepository;

    public OrderingService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order placeOrder(Book book, User customer) {
        return null;
    }


    public List<Order> placeOrders(List<Book> books, User customer) {
        return null;
    }

    public List<Order> getOrdersForUser(User user) {
        return null;
    }

    public List<Order> getOrdersForBook(Book book){
        return null;
    }
}
