package com.eureka.client1.controller;

import com.eureka.client1.feign.FeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client1")
@RefreshScope       //Bus消息总线刷新配置
public class TestController {

    @Autowired
    private FeignInterface feignInterface;
    @Value("${wx.appid}")
    private String appid;
    @Value("${data.value}")
    private String value;

    @GetMapping("test1")
    public String test1(){
        System.out.println("服务1  "+appid+"  "+value);
        return feignInterface.test1();
    }



}
