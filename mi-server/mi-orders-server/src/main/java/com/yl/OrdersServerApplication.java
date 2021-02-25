package com.yl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.yl.mapper")
public class OrdersServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrdersServerApplication.class,args);
    }
}
