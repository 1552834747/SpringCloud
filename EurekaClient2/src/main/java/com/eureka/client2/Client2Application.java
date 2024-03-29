package com.eureka.client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient     //注册服务到注册中心
public class Client2Application {

    public static void main(String[] args) {
        SpringApplication.run(Client2Application.class, args);
    }

}
