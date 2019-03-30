package com.example.demo02.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class Hello {

    @Id
    private Integer id;

    private String name;
}
