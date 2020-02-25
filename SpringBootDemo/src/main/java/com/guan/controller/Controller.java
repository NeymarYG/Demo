package com.guan.controller;

import com.guan.pojo.User;
import com.guan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;


/**
 * @author guan
 * @date 2020/2/10- 16:24
 */
@RestController
public class Controller {

    @Resource                      //从容器中获取数据源
    private DataSource dataSource;

    @Value("${guan.date}")
    private String date1;

    @Value("${juan.date}")
    private String date2;

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User queryUser(@PathVariable int id) {
        return userService.queryById(id);
    }

    @GetMapping("hello")
    public String hello() {
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("dataSource = " + dataSource);
        return "hello,SpringBoot!";
    }

}
