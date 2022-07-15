package com.aman.bookstore.dataLayer.repo;

import com.aman.bookstore.dataLayer.daos.Persistable;
import com.aman.bookstore.dataLayer.daos.Removable;
import com.aman.bookstore.dataLayer.daos.Searchable;
import com.aman.bookstore.dataLayer.entity.Order;

import java.util.List;

public interface OrderRepository extends Persistable<Order>, Removable<Order>, Searchable<Order> {

    List<Order> getOrdersForUser(Integer id);

    List<Order> getOrdersForBook(Integer id);
}
