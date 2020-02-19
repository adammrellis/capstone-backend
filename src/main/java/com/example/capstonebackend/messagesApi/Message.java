package com.example.capstonebackend.messagesApi;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "messages")
@Data

public class Message {
    public Message() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String messageBody;


    public int getId() {
        return id;
    }

    public String getName() { return name; }

    public String getEmail() {
        return email;
    }

    public String getMessageBody() {
        return messageBody;
    }

}