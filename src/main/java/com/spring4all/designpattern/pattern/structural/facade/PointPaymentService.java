package com.spring4all.designpattern.pattern.structural.facade;

/**
 * @author qiankeqin
 * @Description: 积分支付服务
 * @date 2019-02-02 20:13
 */
public class PointPaymentService {
    public boolean pay(PointsGift pointsGift){
        //扣减积分
        System.out.println("支付"+pointsGift.getName()+" 积分成功");
        return true;
    }
}