package com.spring4all.designpattern.pattern.behavioral.strategy;

import org.springframework.util.StringUtils;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-27 20:34
 */
public class Test2 {
    public static void main(String[] args) {
        PromotionStrategy promotionStrategy = null;
        String promotionKey = "lijian";
        if(StringUtils.pathEquals(promotionKey,"lijian")){
            promotionStrategy = new LiJianPromotionStrategy();
        } else if(StringUtils.pathEquals(promotionKey,"fanxian")){
            promotionStrategy = new FanXianPromotionStrategy();
        } else {
            promotionStrategy = new ManJianPromotionStrategy();
        }
    }
}