package com.spring4all.designpattern.pattern.behavioral.strategy;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-27 20:28
 */
public class Test {

    public static void main(String[] args) {
        PromotionActivity activity618 = new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity activity1111 = new PromotionActivity(new FanXianPromotionStrategy());
        activity618.executePromotionStrategy();
        activity1111.executePromotionStrategy();
    }
}