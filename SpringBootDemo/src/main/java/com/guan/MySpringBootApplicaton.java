package com.guan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author guan
 * @date 2020/2/10- 3:08
 * //@MapperScan("com.guan.mapper")            //扫描mybatis所有的业务 mapper 接口
 */
@SpringBootApplication
@MapperScan("com.guan.mapper")           //使用通用mapper组件的扫描  tk.开头
public class MySpringBootApplicaton {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplicaton.class,args);
    }
}

