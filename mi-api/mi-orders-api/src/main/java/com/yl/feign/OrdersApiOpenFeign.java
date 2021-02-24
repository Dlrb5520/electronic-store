package com.yl.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("mi-order-server")
public interface OrdersApiOpenFeign {


}
