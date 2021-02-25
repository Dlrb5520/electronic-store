package com.yl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yl.orders.Orders;

import java.util.List;

public interface IOrderService  extends IService<Orders> {

    List<Orders> getOrderList();
}
