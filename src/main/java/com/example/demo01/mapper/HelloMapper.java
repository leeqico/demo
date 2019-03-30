package com.example.demo01.mapper;

import com.example.demo01.entity.Hello;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface HelloMapper extends Mapper<Hello> {

}
