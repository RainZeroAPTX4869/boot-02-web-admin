package com.rain.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan("com.rain.admin.servlet")
@SpringBootApplication
public class Boot02WebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot02WebAdminApplication.class, args);
    }

}
