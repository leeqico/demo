package com.example.demo03.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo03.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
