package com.Ahmad.SimpleSpringBootProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")

    public String greet(){
        return "Hello Ahmad, Welcome...";
    }
    @RequestMapping("/about")
    public String about(){
        return "Don't Eat, Where you shit";
    }
}
