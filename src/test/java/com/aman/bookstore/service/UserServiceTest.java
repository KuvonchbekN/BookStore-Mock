package com.aman.bookstore.service;

import com.aman.bookstore.dataLayer.entity.*;
import com.aman.bookstore.dataLayer.repo.OrderRepository;
import com.aman.bookstore.service.OrderingService;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;


public class UserServiceTest
{


    @Mock
     OrderRepository orderRepository;

    @InjectMocks
     OrderingService orderingService;


    ID id = new ID(1);
    BookGenre bookGenre= new BookGenre("something");

    User user = new User(id,"someoneUsername", "123");
     Book book = new Book(id, "something","someone", bookGenre);
    Order order = new Order(id, book, user, new Date());


    @Test
    public void placeOrderTest(){
        when(orderRepository.save(ArgumentMatchers.any(Order.class))).thenReturn(order);
        Order orderUnderTest = orderingService.placeOrder(book, user);

        assertEquals(orderUnderTest.book.bookAuthorName, book.bookAuthorName);
    }

}
