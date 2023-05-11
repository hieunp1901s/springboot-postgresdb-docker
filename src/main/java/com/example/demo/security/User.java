package com.example.demo.security;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user_1")
@Data
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;
    private String password;
}
