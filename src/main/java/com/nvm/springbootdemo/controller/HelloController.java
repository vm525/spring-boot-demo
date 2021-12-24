package com.nvm.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String printHi() {
        return "Hi! This is our first endpoint. NVM....";
    }
}
