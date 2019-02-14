package com.spring4all.designpattern.pattern.structural.proxy;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-14 13:00
 */
public class Order {
    private Object orderInfo;

    private Integer userId;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}