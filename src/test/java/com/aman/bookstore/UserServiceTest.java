package com.aman.bookstore;

import com.aman.bookstore.dataLayer.entity.*;
import com.aman.bookstore.dataLayer.impl.OrderRepoImpl;
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

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class UserServiceTest
{


    @Mock
    OrderRepoImpl orderRepo;

    @InjectMocks
     OrderingService orderingService;


    private Order order;
    private Book book;
    private User user;

    @Test
    public void placeOrderTest(){
        ID id = new ID(1);
        BookGenre bookGenre= new BookGenre("something");
        book = new Book(id, "something","someone", bookGenre);
        user = new User(id,"someoneUsername", "123");
        order = new Order(id, book, user, new Date());


        when(orderRepo.save(order)).thenReturn(order);
        Order orderUnderTest = orderingService.placeOrder(book, user);

        assertEquals(orderUnderTest.book.bookAuthorName, book.bookAuthorName);

        assertFalse(false);
    }


    @Test
    public void testing(){
        assertTrue(true);
    }
}
