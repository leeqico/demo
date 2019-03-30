package com.example.demo02.service.impl;

import com.example.demo02.entity.Hello;
import com.example.demo02.mapper.HelloMapper;
import com.example.demo02.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloMapper helloMapper;

    @Override
    public int add(Hello hello) {
        return helloMapper.insert(hello);
    }

    @Override
    public int delete(Integer id) {
        return helloMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Hello hello) {
        return helloMapper.updateByPrimaryKeySelective(hello);
    }

    @Override
    public List<Hello> selectAll() {
        return helloMapper.selectAll();
    }

    @Override
    public Hello selectById(Integer id) {
        return helloMapper.selectByPrimaryKey(id);
    }

    @Override
    public Hello selectByName(String name) {
        return helloMapper.selectByName(name);
    }
}
