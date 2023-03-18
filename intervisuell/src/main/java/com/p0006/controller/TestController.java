package com.p0006.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/")
    public String helloWorld() {
        System.out.println("ich bin hier");
        return "Hallo Welt!";
    }
}
