package com.syntexpro.login.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/V1/login")

public class UserController {

//    @Autowired
//    private Service service;

    @GetMapping("/status")
    public String status (){
        return "Service is up and Running";
    }

}
