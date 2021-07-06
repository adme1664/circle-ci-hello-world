package com.example.circlecihelloworld.utils;

import com.example.circlecihelloworld.models.User;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Component
public class UsersData {

    private List<User> users;

    public UsersData(List<User> users) {
        this.users = users;
    }

    public UsersData() {
        users=new ArrayList<>();
    }

    public  List<User> listOfUsers() {
        users.add(new User("Adme", "Jean Jeff", "ADMIN"));
        users.add (new User("Baby", "Adme", "ADMIN"));
        return users;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public User updateUser(User user) {
        return users.stream().filter(user1 -> user1.getFirstName().equalsIgnoreCase(user.getFirstName()))
                .map(user1 -> {
                    user1.setFirstName(user.getFirstName());
                    user1.setPrivilege(user.getPrivilege());
                    user1.setLastName(user.getLastName());
                    return user1;
                }).findAny().orElseThrow();

    }

    public User getUser(User user) {
        return users.stream().filter(user1 -> user1.getFirstName().equalsIgnoreCase(user.getFirstName()))
                .findAny().orElseThrow();
    }
}
