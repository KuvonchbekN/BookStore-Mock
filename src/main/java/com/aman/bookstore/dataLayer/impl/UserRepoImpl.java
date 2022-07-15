package com.aman.bookstore.dataLayer.impl;

import com.aman.bookstore.dataLayer.entity.ID;
import com.aman.bookstore.dataLayer.entity.User;
import com.aman.bookstore.dataLayer.exception.NotFoundException;
import com.aman.bookstore.dataLayer.repo.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserRepoImpl implements UserRepository {
    List<User> list = new ArrayList<>();

    @Override
    public User findById(ID id) {
        for (User user: list){
            if (user.id.id.equals(id.id)){
                return user;
            }
        }
        throw new NotFoundException("User not found");
    }

    @Override
    public List<User> findAll() {
        return list;
    }

    @Override
    public boolean validate(String username, String password) {
        for (User user : list){
            if (user.username.equals(username) && user.password.equals(password)){
                return true;
            }
        }
        return false;
    }

    @Override
    public User findByUsername(String username) {
        for (User user : list){
            if (user.username.equals(username)){
                return user;
            }
        }
        return null;
    }
}
