package com.example.todowebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    public String sayHelloHtml() {
        return "sayHello";
    }
}
