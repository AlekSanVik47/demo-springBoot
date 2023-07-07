package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        if (userRepository.findByLogin(user.getLogin()).isEmpty()){
           return userRepository.save(user);
        }
        return userRepository.findById(user.getId());
    }

    @Override
    public Optional<User> findByUserLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    public User findByUserId(Long id) {
        return userRepository.findById(id);
    }
}
