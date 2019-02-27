package com.spring4all.designpattern.pattern.behavioral.strategy;

/**
 * @author qiankeqin
 * @Description: 无促销活动策略
 * @date 2019-02-27 20:44
 */
public class EmptyPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无活动");
    }
}