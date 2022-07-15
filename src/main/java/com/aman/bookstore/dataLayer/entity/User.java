package com.aman.bookstore.dataLayer.entity;

public class User {
    public ID id;
    public String username, password;

    public User(ID id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }


}
