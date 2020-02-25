package com.guan.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author guan
 * @date 2020/2/10- 21:27    使用在方法上@ConfigurationPropertie,就不用编写配置项类
 *
 * ConfigurationProperties从application配置文件中读取配置项
 * prefix表示  配置项的前缀
 * 配置项类中的类变量名必须要与 前缀之后的配置项名称保持 松散绑定(相同)
 */
//@ConfigurationProperties(prefix = "jdbc")
public class jdbcProperties {

//    private String driver;
//    private String url;
//    private String username;
//    private String password;
//
//    public String getDriver() {
//        return driver;
//    }
//
//    public void setDriver(String driver) {
//        this.driver = driver;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
}
