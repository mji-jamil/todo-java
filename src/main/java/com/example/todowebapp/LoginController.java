package com.example.todowebapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {


    // login
    @RequestMapping("login")
    public String gotoLoginWithParam(@RequestParam String name, ModelMap modelMap) {
        modelMap.put("name", name);
        return "login";
    }
}
