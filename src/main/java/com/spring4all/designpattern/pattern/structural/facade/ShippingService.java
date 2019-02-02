package com.spring4all.designpattern.pattern.structural.facade;

/**
 * @author qiankeqin
 * @Description: 物流系统
 * @date 2019-02-02 20:16
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift){
        System.out.println("进入物流"+pointsGift.getName()+"系统");
        String shipNo = "666";//物流订单号
        return shipNo;
    }
}