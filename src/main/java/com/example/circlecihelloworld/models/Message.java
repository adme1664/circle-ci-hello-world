package com.example.circlecihelloworld.models;

import lombok.Data;

@Data
public class Message {

    private String value;

    public Message(String value) {
        this.value = value;
    }

    public Message() {
    }
}
