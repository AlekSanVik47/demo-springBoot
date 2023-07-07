package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.model.User;
import com.example.demo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private final UserServiceImpl usersService;

    public UserController(UserServiceImpl usersService) {
        this.usersService = usersService;
    }
    @PostMapping("/users")
    public User create(@RequestBody User user){
        return usersService.saveUser(user);
    }
}