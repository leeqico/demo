package com.example.demo01.service.impl;

import com.example.demo01.entity.Hello;
import com.example.demo01.mapper.HelloMapper;
import com.example.demo01.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloMapper helloMapper;

    @Override
    public List<Hello> sayHello() {
        return helloMapper.selectAll();
    }
}
