package com.example.TestSpringJPA;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private Double cgpa; 

    // ID Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // Name Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Email Getters and Setters
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // CGPA Getters and Setters 
    public Double getCgpa() {
        return cgpa;
    }
    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }
}