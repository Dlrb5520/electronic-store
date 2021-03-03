package com.yl.controller;

import com.yl.responseBean.ResponseBean;
import com.yl.service.IOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("order")
public class OrderController {

    @Resource
    private IOrderService iorderservice;

    @GetMapping("/getOrderList")
    public ResponseBean getOrderList() throws InterruptedException {
        Thread.sleep(5000);
        return new ResponseBean(200,"查询成功",this.iorderservice.getOrderList());
    }

    @GetMapping("/getOrderListById")
    public ResponseBean getOrderListById() {
        return  new ResponseBean(200,"查询成功byId",this.iorderservice.getOrderList());
    }
}
