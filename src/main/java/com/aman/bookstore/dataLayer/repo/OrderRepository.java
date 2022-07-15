package com.aman.bookstore.dataLayer.repo;

import com.aman.bookstore.dataLayer.daos.Persistable;
import com.aman.bookstore.dataLayer.daos.Removable;
import com.aman.bookstore.dataLayer.daos.Searchable;
import com.aman.bookstore.dataLayer.entity.Order;

public interface OrderRepository extends Persistable<Order>, Removable<Order>, Searchable<Order> {

}
