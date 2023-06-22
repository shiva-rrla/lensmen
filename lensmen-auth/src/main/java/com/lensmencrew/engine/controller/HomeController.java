package com.lensmencrew.engine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Welcome Home!";
    }

    @GetMapping("/secure")
    public String secure(){
        return "Welcome Secure Home!";
    }
}
