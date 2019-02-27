package com.spring4all.designpattern.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qiankeqin
 * @Description: 促销策略工厂
 * @date 2019-02-27 20:41
 */
public class PromotionStrategyFactory {
    private static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();
    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN,new LiJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN,new ManJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN,new FanXianPromotionStrategy());
    }

    private PromotionStrategyFactory(){

    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        if(null == promotionStrategy){
            promotionStrategy = new EmptyPromotionStrategy();
        }
        return promotionStrategy;
    }

    private interface PromotionKey{
        String LIJIAN = "LIJIAN";
        String MANJIAN = "MANJIAN";
        String FANXIAN = "FANXIAN";
    }
}