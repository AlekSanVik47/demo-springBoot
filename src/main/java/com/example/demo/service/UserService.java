package com.example.demo.service;

import com.example.demo.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    Optional<User> findByUserLogin (String login);
    User findByUserId (Long id);
}
