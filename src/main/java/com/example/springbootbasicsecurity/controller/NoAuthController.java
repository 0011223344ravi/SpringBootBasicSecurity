package com.example.springbootbasicsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("NoAuth")
public class NoAuthController {


    @GetMapping("/sayHi")
    public String sayHi() {
        return "hi";
    }

}
