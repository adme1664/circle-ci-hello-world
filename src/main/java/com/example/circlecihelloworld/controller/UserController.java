package com.example.circlecihelloworld.controller;

import com.example.circlecihelloworld.models.User;
import com.example.circlecihelloworld.utils.UsersData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    
    @GetMapping(value = "/users")
    public List<User> listOfUsers(){
        return UsersData.listOfUsers();
    }
    
    @GetMapping(value="/first")
    public User getFirstUser(){
        return UsersData.listOfUsers().get(0);
    }
}
