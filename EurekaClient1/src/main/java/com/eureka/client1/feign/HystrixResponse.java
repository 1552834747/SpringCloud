package com.eureka.client1.feign;


import org.springframework.stereotype.Component;

/**
 * 定义熔断响应对象
 */
@Component
public class HystrixResponse implements FeignInterface {
    public String test1(){
        return "熔断了";
    }
}
