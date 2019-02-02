package com.spring4all.designpattern.pattern.structural.facade;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-02 21:01
 */
public class Test {
    public static void main(String[] args) {
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        PointsGift pointsGift = new PointsGift("奥迪Q7");
        giftExchangeService.giftExchange(pointsGift);
    }
}