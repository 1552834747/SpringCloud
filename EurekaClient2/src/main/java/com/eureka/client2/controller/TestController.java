package com.eureka.client2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client2")
@RefreshScope       //Bus消息总线刷新配置
public class TestController {

    @Value("${server.port}")
    private String serverPort;
    @Value("${wx.appid}")
    private String appid;
    @Value("${data.value}")
    private String value;

    @RequestMapping(value = "test1",method = RequestMethod.GET)
    public String test1(){
        System.out.println("服务2====>端口："+serverPort+"   "+appid+"  "+value);
        return "eurekaCelient2";
    }

}
