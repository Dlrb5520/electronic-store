package com.yl.feign;

import com.yl.fallbackFactory.OrderFallbackFactory;
import com.yl.orders.Orders;
import com.yl.responseBean.ResponseBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "mi-order-server",fallbackFactory = OrderFallbackFactory.class)
public interface OrdersApiOpenFeign {

    @GetMapping("order/getOrderList")
    ResponseBean getOrdersList();

    @GetMapping("order/getOrderListById")
    ResponseBean getOrderListById();

}
