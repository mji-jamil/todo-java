package com.example.todowebapp;

import org.springframework.web.bind.annotation.RequestMapping;

public class SayHelloController {

    @RequestMapping("say-hello")
    public String sayHello() {
        return "Hello! What are you learning today?";
    }
}
