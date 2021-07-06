package com.example.circlecihelloworld.models;

import lombok.Data;

@Data
public class User {
    private String firstName;
    private String lastName;
    private String privilege;

    public User(String firstName, String lastName, String privilege) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.privilege = privilege;
    }

    public User() {
    }
}
