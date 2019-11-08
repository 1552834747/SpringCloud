package com.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * localhost:7001/actuator/bus-refresh   刷新全部配置
 *
 */

@SpringBootApplication
@EnableConfigServer             //配置中心
@EnableEurekaClient             //注册到注册中心
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }

}
