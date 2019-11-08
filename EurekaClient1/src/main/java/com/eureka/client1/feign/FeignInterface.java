package com.eureka.client1.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Feign远程调用
 *      name:        调用的服务名
 *      path：       调用的前缀路径
 *      fallback：   熔断调用的对象
 */
@FeignClient(name = "client2",path = "client2",fallback = HystrixResponse.class)
public interface FeignInterface {
    @RequestMapping(path = "test1" , method = RequestMethod.GET)
    String test1();
}
