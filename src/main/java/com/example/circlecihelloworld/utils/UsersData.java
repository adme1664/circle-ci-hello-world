package com.example.circlecihelloworld.utils;

import com.example.circlecihelloworld.models.User;

import java.util.Arrays;
import java.util.List;

public class UsersData {

    public static final List<User> listOfUsers() {
        return Arrays.asList(new User("Adme", "Jean Jeff", "ADMIN"),
                new User("Baby", "Adme", "ADMIN"));
    }
}
