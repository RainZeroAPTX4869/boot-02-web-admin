package com.rain.admin.config;

import com.rain.admin.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * servlet不使用注解，就要使用RegistrationBean注册到容器中
 *
 * @author RainZero
 * @date 2021/03/05 09:57
 */
@Configuration
public class MyRegistConfig {
    @Bean
    public ServletRegistrationBean myServlet() {
        MyServlet myservlet = new MyServlet();
        return new ServletRegistrationBean(myservlet, "/my");
    }
}
