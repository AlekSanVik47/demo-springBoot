package com.example.demo.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;

    @Column
    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Task> taskList;

}
