package com.spring4all.designpattern.pattern.behavioral.strategy;

/**
 * @author qiankeqin
 * @Description: 立减促销策略
 * @date 2019-02-27 20:21
 */
public class LiJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("立减，立减20");
    }
}