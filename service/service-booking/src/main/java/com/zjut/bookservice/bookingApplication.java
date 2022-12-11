package com.zjut.bookservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.zjut")
@MapperScan("com.zjut.bookservice.mapper")
public class bookingApplication {
    public static void main(String[] args) {
        SpringApplication.run(bookingApplication.class, args);
    }
}
