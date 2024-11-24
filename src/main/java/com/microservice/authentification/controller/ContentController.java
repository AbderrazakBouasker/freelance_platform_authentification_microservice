package com.microservice.authentification.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }
    @GetMapping("/admin/home")
    public String admin() {
        return "admin";
    }
    @GetMapping("/user/home")
    public String user() {
        return "user";
    }
//    @GetMapping("/login")
//    public String login() {
//        return "custom_login";
//    }
}
