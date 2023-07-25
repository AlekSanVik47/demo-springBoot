package com.example.demo.service;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private TaskRepository taskRepository;
    public Task taskCreate(Task task){
        task.setUserId(userService.getCurrentUser().getId());
        return taskRepository.save(task);
    }



}
