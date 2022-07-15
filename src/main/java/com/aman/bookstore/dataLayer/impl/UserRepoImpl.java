package com.aman.bookstore.dataLayer.impl;

import com.aman.bookstore.dataLayer.entity.ID;
import com.aman.bookstore.dataLayer.entity.User;
import com.aman.bookstore.dataLayer.repo.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserRepoImpl implements UserRepository {
    List<User> list = new ArrayList<>();

    @Override
    public User findById(ID id) {
        for (User user: list){

        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public boolean validate(String username, String password) {
        return false;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }
}
