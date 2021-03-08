package com.rain.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan("com.rain.admin.dao")
@ServletComponentScan("com.rain.admin.servlet")
@SpringBootApplication
public class Boot02WebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot02WebAdminApplication.class, args);
    }

}
