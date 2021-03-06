package com.aman.bookstore.service;

import com.aman.bookstore.dataLayer.entity.Book;
import com.aman.bookstore.dataLayer.entity.ID;
import com.aman.bookstore.dataLayer.entity.Order;
import com.aman.bookstore.dataLayer.entity.User;
import com.aman.bookstore.dataLayer.repo.BookRepository;
import com.aman.bookstore.dataLayer.repo.OrderRepository;
import com.aman.bookstore.dataLayer.repo.UserRepository;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderingService {
    private OrderRepository orderRepository;
    private BookRepository bookRepository;
    private UserRepository userRepository;
    private int orderId = 1;

    public OrderingService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order placeOrder(Book book, User customer) {
        Book book1 = bookRepository.findById(new ID(book.id.id));
        User user = userRepository.findById(new ID(customer.id.id));
        ID id = new ID(orderId++);
        Order order = new Order(id,book1, user, new Date());
        return orderRepository.save(order);
    }


    public List<Order> placeOrders(List<Book> books, User customer) {
        User user = userRepository.findById(new ID(customer.id.id));
        List<Order> list = new ArrayList<>();
        for (Book book : books){
            Book book1 = bookRepository.findById(new ID(book.id.id));
            ID id = new ID(orderId);
            Order order = new Order(id,book1, user, new Date());
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
