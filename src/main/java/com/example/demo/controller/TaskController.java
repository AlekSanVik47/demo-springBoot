package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;
    @PostMapping("/tasks")
    public Task create(@RequestBody Task task){
       return taskRepository.save(task);
    }
    @GetMapping("/tasks")
    public List<Task> getAllTasks(){
        return  taskRepository.findAll();
    }
    @GetMapping("/tasks/{id}")
    public Task getTask(@PathVariable(required = false) Long id){
        return  taskRepository.findById(id);
    }

    @PutMapping("/tasks/{id}")
    public Task update(@PathVariable(required = false) Long id, @RequestBody(required = false) Task task){
        task.setId(id);
        return taskRepository.save(task);
    }

    @DeleteMapping("/tasks/{id}")
    public void delete( @PathVariable(required = false) Long id){
        taskRepository.deleteById(id);
    }

    @PatchMapping("/tasks/{id}")
    public void patchMethod(@PathVariable Long id){
        taskRepository.markAsDone(id);
    }
    @PatchMapping("/tasks/{id}:mark-as-done")
    public void patchMethod1(@PathVariable Long id){
        taskRepository.markAsDone(id);
    }
}

