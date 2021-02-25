package com.yl.feign;

import com.yl.orders.Orders;
import com.yl.responseBean.ResponseBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("mi-order-server")
public interface OrdersApiOpenFeign {

    @GetMapping("order/getOrderList")
    ResponseBean getOrdersList();

}
