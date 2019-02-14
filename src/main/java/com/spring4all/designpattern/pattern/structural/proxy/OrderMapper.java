package com.spring4all.designpattern.pattern.structural.proxy;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-14 13:02
 */
public class OrderMapper implements IOrderMapper{

    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}