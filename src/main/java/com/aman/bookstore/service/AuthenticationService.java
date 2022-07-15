package com.aman.bookstore.service;

import com.aman.bookstore.dataLayer.entity.User;
import com.aman.bookstore.dataLayer.impl.UserRepoImpl;
import com.aman.bookstore.dataLayer.repo.UserRepository;

public class AuthenticationService {
     private final UserRepository userRepository;

    public AuthenticationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User authenticate(String username, String password){
        boolean validate = userRepository.validate(username, password);
        if (validate){
            return userRepository.findByUsername(username);
        }
        return null;
    }
}
