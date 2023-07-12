package com.example.demo.service;

import com.example.demo.model.User;

import java.util.Optional;

public interface UserService {
    Optional<User> saveUser(User user);

    User create(User user);

    User getCurrentUser();

    Optional<User> findByUserLogin (String login);
    Optional<User> findByUserId (Long id);
}
