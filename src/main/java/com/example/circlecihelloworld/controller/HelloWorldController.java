package com.example.circlecihelloworld.controller;

import com.example.circlecihelloworld.models.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(value = "/hello-world")
    public Message helloWorldInMessage(){
        return new Message("Hello world");
    }
}
