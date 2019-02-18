package com.spring4all.designpattern.pattern.structural.proxy.staticproxy;

import com.spring4all.designpattern.pattern.structural.proxy.Order;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-15 19:35
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}