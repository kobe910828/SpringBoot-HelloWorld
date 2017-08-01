package com.example.springboot.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring Boot应用启动类
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.example.springboot")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);

    }
}
