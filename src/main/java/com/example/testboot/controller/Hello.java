package com.example.testboot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class Hello {
    @RequestMapping(value = "/resthello")
    public String hello() {
        return "welcome Hello World !! ";
    }
}