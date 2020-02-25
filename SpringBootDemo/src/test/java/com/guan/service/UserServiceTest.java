package com.guan.service;

import com.guan.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author guan
 * @date 2020/2/14- 15:40
 */
@RunWith(SpringRunner.class)            //spring运行环境
@SpringBootTest                         //springboot项目的测试类要加@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void queryById() {
        User user = userService.queryById(10);
        System.out.println("user = " + user);
    }

    @Test
    void saveUser() {
        User user = new User();
        user.setU_username("Neymar");
        user.setU_password("11");
        userService.saveUser(user);
    }
}