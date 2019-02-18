package com.spring4all.designpattern.pattern.structural.proxy.dynamicproxy;

import com.spring4all.designpattern.pattern.structural.proxy.IOrderService;
import com.spring4all.designpattern.pattern.structural.proxy.Order;
import com.spring4all.designpattern.pattern.structural.proxy.OrderServiceImpl;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-18 13:27
 */
public class Test {
    public static void main(String[] args) {
        OrderServiceDynamicProxy dynamicProxy = new OrderServiceDynamicProxy(new OrderServiceImpl());
        IOrderService orderService = (IOrderService) dynamicProxy.bind();
        Order order = new Order();
        order.setUserId(1);
        orderService.saveOrder(order);
    }
}