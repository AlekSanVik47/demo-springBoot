package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private final UserServiceImpl usersService;

    public UserController(UserServiceImpl usersService) {
        this.usersService = usersService;
    }
    @PostMapping("/users")
    public User create(@RequestBody User user){
        return usersService.create(user);
    }
    @GetMapping("/users/{id}")
    public Optional<User> getUserById(@PathVariable(required = false) Long id){
        return usersService.findByUserId(id);
    }
}
