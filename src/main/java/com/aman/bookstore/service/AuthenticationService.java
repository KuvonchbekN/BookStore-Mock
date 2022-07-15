package com.aman.bookstore.service;

import com.aman.bookstore.dataLayer.entity.User;
import com.aman.bookstore.dataLayer.repo.UserRepository;

public class AuthenticationService {
     private UserRepository userRepository;

    public AuthenticationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User authenticate(String username, String password){

        return null;
    }
}
