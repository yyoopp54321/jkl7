package com.example.jkl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value = "hello")
    public String Get(){
        return "hello";
    }

}
