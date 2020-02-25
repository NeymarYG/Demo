package com.guan.config;

import com.guan.Interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author guan
 * @date 2020/2/12- 17:36
 *
 * 实现WebMvcConfigurer
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    //注册拦截器.  放在spring容器中
    @Bean
    public MyInterceptor myInterceptor() {
        return new MyInterceptor();
    }

    //添加拦截器到spring mvc的拦截器链
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor()).addPathPatterns("/*");
    }
}
