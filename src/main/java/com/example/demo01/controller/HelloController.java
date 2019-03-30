package com.example.demo01.controller;

import com.example.demo01.entity.Hello;
import com.example.demo01.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @PostMapping("/hello")
    public List<Hello> hello(){
        return helloService.sayHello();
    }

}
