package com.example.demo02.service;

import com.example.demo02.entity.Hello;

import java.util.List;

public interface HelloService {

    int add(Hello hello);

    int delete(Integer id);

    int update(Hello hello);

    List<Hello> selectAll();

    Hello selectById(Integer id);

    Hello selectByName(String name);
}
