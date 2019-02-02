package com.spring4all.designpattern.pattern.structural.facade;

/**
 * @author qiankeqin
 * @Description: 验证兑换资格
 * @date 2019-02-02 19:41
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验"+pointsGift.getName()+" 积分资格通过，库存通过");

        return true;
    }
}