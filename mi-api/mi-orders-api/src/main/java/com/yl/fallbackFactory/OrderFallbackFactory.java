package com.yl.fallbackFactory;

import com.yl.feign.OrdersApiOpenFeign;
import com.yl.responseBean.ResponseBean;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class OrderFallbackFactory implements FallbackFactory<OrdersApiOpenFeign> {

    @Override
    public OrdersApiOpenFeign create(Throwable throwable) {
        return new OrdersApiOpenFeign() {
            @Override
            public ResponseBean getOrdersList() {
                return new ResponseBean(400,"当前服务不可用,请稍后再试......");
            }

            @Override
            public ResponseBean getOrderListById() {
                return new ResponseBean(400,"当前服务不可用,请稍后再试......");
            }
        };
    }
}
