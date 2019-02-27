package com.spring4all.designpattern.pattern.behavioral.strategy;

/**
 * @author qiankeqin
 * @Description: 返现促销策略
 * @date 2019-02-27 20:22
 */
public class FanXianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额直接存在钱包中");
    }
}