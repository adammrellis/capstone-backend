package com.example.capstonebackend.usersApi;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data

public class User {
    public User() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String password;

    @Column
    private Boolean admin;

}