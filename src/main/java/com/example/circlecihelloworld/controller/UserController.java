package com.example.circlecihelloworld.controller;

import com.example.circlecihelloworld.models.User;
import com.example.circlecihelloworld.utils.UsersData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UsersData usersData;

    public UserController(UsersData usersData) {
        this.usersData = usersData;
    }

    @GetMapping(value = "/users")
    public List<User> listOfUsers() {
        return usersData.getUsers();
    }

    @GetMapping(value = "/first")
    public User getFirstUser() {
        return UsersData.listOfUsers().get(0);
    }

    @GetMapping(value = "/add-user")
    public String addUser() {
        var user = new User("Adme", "Jean Jeff", "USERS");
        usersData.addUser(user);
        return "User add succesfully";
    }

    @GetMapping(value = "/update-user")
    public User updateUser(){
        var user=new User("Jordany","Pierre","OK");
        return usersData.updateUser(user);
    }
}
