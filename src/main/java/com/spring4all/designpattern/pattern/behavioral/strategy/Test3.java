package com.spring4all.designpattern.pattern.behavioral.strategy;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-27 20:49
 */
public class Test3 {
    public static void main(String[] args) {
        String promotionKey = "MANJIAN";
        PromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(promotionKey);
        promotionStrategy.doPromotion();
    }
}