package com.example.springbootmybatisplus;

import com.example.springbootmybatisplus.entity.User;
import com.example.springbootmybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.sql.DataSource;
import java.util.List;

@SpringBootTest
class SpringbootMybatisPlusApplicationTests implements ApplicationContextAware {

    ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    @Autowired
    UserMapper userMapper;

    @Test
    void test1() {

//        List<User> users = userMapper.selectList(null);
//        for (User user : users) {
//            System.out.println(user);
//        }
        User  user = new User(null,"Jeok",26,"test9@baomidou.com");

        userMapper.insert(user);


    }



}
