package com.example.springbootmybatisplus.controller;


import com.example.springbootmybatisplus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/a")
    public void test (){
        System.out.println("aaaaaaaaa");
        System.out.println("vvvvvvvvv");
    }
}
