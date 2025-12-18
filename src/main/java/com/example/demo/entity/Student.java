package com.example.demo.entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(messege="Name filled cannot be empty")
    @Size(min=3,max=20,messege="The name must be min  and max 20")
    private String name;
    @Email(messege="invalid email")
    @column(unique=true)
    private String email;
    private int age;

    // getters & setters
}
