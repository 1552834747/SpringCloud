package com.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class AccessFilter extends ZuulFilter {

    @Value("${server.port}")
    private String serverPort;

    /**
     * 过滤器的类型,它决定过滤器在请求的哪个生命周期中执行,
     * pre:请求被路由之前做一些前置工作 ,比如请求和校验
     * routing : 在路由请求时被调用,路由请求转发,即是将请求转发到具体的服务实例上去.
     * post : 在routing 和 error过滤器之后被调用..所以post类型的过滤器可以对请求结果进行一些加工
     * error :处理请求发生错误时调用
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器的执行顺序.
     * 在一个阶段有多个过滤器时,需要用此指定过滤顺序
     * 数值越小优先级越高
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 判断过滤器是否执行,直接返回true,代表对所有请求过滤
     * 此方法指定过滤范围
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤的具体逻辑
     */
    @Override
    public Object run() throws ZuulException {
        // 正常执行调用其他服务接口...
        System.out.println("网关执行端口号:" + serverPort);
        return null;
    }
}
