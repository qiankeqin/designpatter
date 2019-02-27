package com.spring4all.designpattern.pattern.behavioral.strategy;

/**
 * @author qiankeqin
 * @Description: 返代金券策略
 * @date 2019-02-27 20:30
 */
public class FanDaiJinQuanPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返代金券，放到钱包中");
    }
}