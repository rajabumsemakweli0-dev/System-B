package com.example.demo.Service;


import com.example.demo.entity.User;

public interface UserService {
    User register(User user);
    User login(String email, String password);
}