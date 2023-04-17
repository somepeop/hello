package com.itheima.sayhello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloWorld {
    @RequestMapping
    public String hello(){
        System.out.println("hello world");
        return "Hello World!";
    }
}
