package com.spring4all.designpattern.pattern.structural.proxy.staticproxy;

import com.spring4all.designpattern.pattern.structural.proxy.IOrderService;
import com.spring4all.designpattern.pattern.structural.proxy.Order;
import com.spring4all.designpattern.pattern.structural.proxy.OrderServiceImpl;
import com.spring4all.designpattern.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * @author qiankeqin
 * @Description: 静态代理类
 * @date 2019-02-15 12:56
 */
public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order){
        beforeMethod();
        iOrderService = new OrderServiceImpl();
        int userId = order.getUserId();
        int dbRouter = userId%2;

        System.out.println("静态代理分配到[db"+dbRouter+"]处理数据");
        //todo 设置dataSource
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));

        afterMethod();
        return iOrderService.saveOrder(order);
    }

    private void beforeMethod(){
        System.out.println("静态代理 before code");
    }

    private void afterMethod(){
        System.out.println("静态代理 after code");
    }
}