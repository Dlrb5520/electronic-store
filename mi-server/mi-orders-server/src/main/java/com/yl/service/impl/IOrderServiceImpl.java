package com.yl.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yl.mapper.OrderMapper;
import com.yl.orders.Orders;
import com.yl.service.IOrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IOrderServiceImpl extends ServiceImpl<OrderMapper, Orders> implements IOrderService {

    
    @Override
    public List<Orders> getOrderList() {
        LambdaQueryWrapper<Orders> lqw = new LambdaQueryWrapper<>();
        lqw.eq(Orders::getId,"1");
        return this.baseMapper.selectList(lqw);
    }
}
