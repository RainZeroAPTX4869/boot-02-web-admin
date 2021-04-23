package com.rain.admin.config;

import com.rain.admin.interceptor.LoginInterceptor;
import com.rain.admin.interceptor.RedisInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created with IntelliJ IDEA.
 * 1、编写一个拦截器实现HandlerInterceptor接口
 * 2、将拦截器注册到容器中（实现WebMvcConfigurer的addInterceptors)
 * 3、配置拦截规则（将静态资源除外）
 *
 * @author RainZero
 * @date 2021/03/04 14:27
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {

    @Autowired
    RedisInterceptor redisInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/", "/login", "/css/**", "/fonts/**", "/images/**", "/js/**");
        registry.addInterceptor(redisInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/", "/login", "/css/**", "/fonts/**", "/images/**", "/js/**");
    }
}
