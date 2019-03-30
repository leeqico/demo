package com.example.demo02.mapper;

import com.example.demo02.entity.Hello;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;


@Repository
public interface HelloMapper extends Mapper<Hello> {
}
