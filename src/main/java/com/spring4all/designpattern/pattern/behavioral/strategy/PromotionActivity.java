package com.spring4all.designpattern.pattern.behavioral.strategy;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-27 20:24
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    /**
     * 构造器注入促销策略
     * @param promotionStrategy
     */
    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }

}