package com.spring4all.designpattern.pattern.behavioral.strategy;

/**
 * @author qiankeqin
 * @Description: 满减促销策略
 * @date 2019-02-27 20:20
 */
public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减，满200减20");
    }
}