package com.aman.bookstore.dataLayer.impl;


import com.aman.bookstore.dataLayer.entity.ID;
import com.aman.bookstore.dataLayer.entity.Order;
import com.aman.bookstore.dataLayer.repo.OrderRepository;

import java.util.ArrayList;
import java.util.List;

public class OrderRepoImpl implements OrderRepository {
    List<Order> list = new ArrayList<>();

    @Override
    public Order save(Order order) {
         list.add(order);
         return order;
    }

    @Override
    public void delete(Order order) {
        list.remove(order);
    }

    @Override
    public Order findById(ID id) {
        for (Order order: list){
            if (order.id.id.equals(id.id)){
                return order;
            }
        }
        return null;
    }

    @Override
    public List<Order> findAll() {
        return list;
    }


    @Override
    public List<Order> getOrdersForUser(Integer id) {
        List<Order> list1 = new ArrayList<>();
        for (Order order : list){
            if (order.customer.id.id.equals(id)){
                list1.add(order);
            }
        }
        return list1;
    }

    @Override
    public List<Order> getOrdersForBook(Integer id) {
        List<Order> list1 = new ArrayList<>();
        for (Order order : list){
            if (order.book.id.id.equals(id)){
                list1.add(order);
            }
        }
        return list1;
    }
}
