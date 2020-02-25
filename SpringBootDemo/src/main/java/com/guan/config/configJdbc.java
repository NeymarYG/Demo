package com.guan.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author guan
 * @date 2020/2/10- 17:18
 */

//@Configuration                                      //设置为配置类
//@PropertySource("classpath:application.yml")        //读取指定的配置文件
//@EnableConfigurationProperties(jdbcProperties.class)        //用配置项类读取配置文件的属性
public class configJdbc {

    /*
    @Value("${jdbc.driverClassName}")                        //获取配置文件的属性
    String driverClassName;
    @Value("${jdbc.url}")
    String url;
    @Value("${jdbc.username}")
    String username;
    @Value("${jdbc.password}")
    String password;

    @Bean                                               //把数据源放入SpringIOC容器
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        return dataSource;
    }
    */

//    @Bean                                              //把数据源放入SpringIOC容器
//    public DataSource dataSource(jdbcProperties jdbcPropertie) {
//        DruidDataSource dataSource = new DruidDataSource();
//
//        dataSource.setDriverClassName(jdbcPropertie.getDriver());       //通过 配置项类 获取
//        dataSource.setUrl(jdbcPropertie.getUrl());
//        dataSource.setUsername(jdbcPropertie.getUsername());
//        dataSource.setPassword(jdbcPropertie.getPassword());
//
//        return dataSource;
//    }

    //因为用了自带的连接池,所以不用druid的连接池了
//    @Bean
//    @ConfigurationProperties(prefix = "jdbc")       //使用@ConfigurationProperties在方法上使用
//    public DataSource dataSource() {
//        return new DruidDataSource();
//    }
}
