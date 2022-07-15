package com.aman.bookstore.dataLayer.repo;

import com.aman.bookstore.dataLayer.daos.Searchable;
import com.aman.bookstore.dataLayer.entity.User;

public interface UserRepository extends Searchable<User> {

    boolean validate(String username, String password);

    User findByUsername(String username);
}
