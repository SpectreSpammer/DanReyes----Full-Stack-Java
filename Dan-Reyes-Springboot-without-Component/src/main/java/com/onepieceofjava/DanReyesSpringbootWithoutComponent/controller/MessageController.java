package com.onepieceofjava.DanReyesSpringbootWithoutComponent.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/component/onepieceofjava")
public class MessageController {


    @GetMapping("/")
    public String getMessage(){
        return "Hello, Welcome to Springboot";
    }
}
