package com.yl.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yl.feign.OrdersApiOpenFeign;
import com.yl.responseBean.ResponseBean;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("apiOrder")
public class OrderApiController {

    @Resource
    private OrdersApiOpenFeign ordersapiopenfeign;

    @GetMapping("/getOrderList")
    // @HystrixCommand(fallbackMethod = "errorFunction")
    @Cacheable(cacheNames = "orderApi:info")
    public ResponseBean getOrderList() throws InterruptedException {
        // Thread.sleep(5000);
        return this.ordersapiopenfeign.getOrdersList();
    }

    @GetMapping("/getOrderListById")
    public ResponseBean getOrderListById() {
        return this.ordersapiopenfeign.getOrderListById();
    }
    public ResponseBean errorFunction() {
        return new ResponseBean(400,"服务不可调用");
    }
}
