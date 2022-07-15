package com.aman.bookstore.service;

import com.aman.bookstore.dataLayer.entity.Book;
import com.aman.bookstore.dataLayer.entity.ID;
import com.aman.bookstore.dataLayer.entity.Order;
import com.aman.bookstore.dataLayer.entity.User;
import com.aman.bookstore.dataLayer.repo.OrderRepository;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderingService {
    private OrderRepository orderRepository;
    private int orderId = 1;

    public OrderingService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order placeOrder(Book book, User customer) {
        ID id = new ID(orderId++);
        Order order = new Order(id,book, customer, new Date());
        return orderRepository.save(order);
    }


    public List<Order> placeOrders(List<Book> books, User customer) {
        List<Order> list = new ArrayList<>();
        for (Book book : books){
            ID id = new ID(orderId);
            Order order = new Order(id,book, customer, new Date());
            list.add(order);
            orderRepository.save(order);
            orderId++;
        }
        return list;
    }

    public List<Order> getOrdersForUser(User user) {
        return orderRepository.getOrdersForUser(user.id.id);
    }

    public List<Order> getOrdersForBook(Book book){
        return orderRepository.getOrdersForBook(book.id.id);
    }
}
