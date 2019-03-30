package com.example.demo02.controller;

import com.example.demo02.entity.Hello;
import com.example.demo02.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @PostMapping("/add")
    public int add(Hello hello){
        return helloService.add(hello);
    }

    @PostMapping("/delete")
    public int delete(Integer id){
        return helloService.delete(id);
    }

    @PostMapping("/update")
    public int update(Hello hello){
        return helloService.update(hello);
    }

    @GetMapping("selectAll")
    public List<Hello> selectAll(){
        return helloService.selectAll();
    }

    @GetMapping("selectById")
    public Hello selectById(Integer id){
        return helloService.selectById(id);
    }

}
