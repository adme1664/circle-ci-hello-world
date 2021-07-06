package com.example.circlecihelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/world")
    public String helloWorld(){
        return "Hello World";
    }
}
