package com.spring4all.designpattern.pattern.structural.proxy;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-14 13:07
 */
public class OrderServiceImpl implements IOrderService {

    private IOrderMapper iOrderMapper;

    @Override
    public int saveOrder(Order order) {
        //这里模式Spring注入
        iOrderMapper = new OrderMapper();
        System.out.println("Service层调用Dao层添加order");
        return iOrderMapper.insert(order);
    }
}