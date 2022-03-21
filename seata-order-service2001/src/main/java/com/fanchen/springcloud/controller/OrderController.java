package com.fanchen.springcloud.controller;

import com.fanchen.springcloud.domain.CommonResult;
import com.fanchen.springcloud.domain.Order;
import com.fanchen.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author fanchen
 * @Date 2022/3/21 16:20
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
