package com.aman.bookstore.service;

import com.aman.bookstore.dataLayer.entity.ID;
import com.aman.bookstore.dataLayer.entity.User;
import com.aman.bookstore.dataLayer.impl.UserRepoImpl;
import com.aman.bookstore.dataLayer.repo.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

class AuthenticationServiceTest {

    @Mock
     UserRepository userRepository = new UserRepoImpl();

    @InjectMocks
     AuthenticationService authenticationService;

     ID id = new ID(1);
     User user = new User(id, "someone", "123");

    @Test
    void authenticate() {
        when(userRepository.validate(anyString(),anyString())).thenReturn(true);
        when(userRepository.findByUsername(anyString())).thenReturn(user);
        User someone = authenticationService.authenticate("someone", "123");
        assertEquals(someone.username, user.username);
    }
}