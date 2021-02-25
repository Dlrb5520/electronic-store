package com.yl.controller;

import com.yl.feign.OrdersApiOpenFeign;
import com.yl.responseBean.ResponseBean;
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
    public ResponseBean getOrderList() throws InterruptedException {
        Thread.sleep(5000);
        return this.ordersapiopenfeign.getOrdersList();
    }
}
