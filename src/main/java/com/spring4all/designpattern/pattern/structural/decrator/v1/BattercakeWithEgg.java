package com.spring4all.designpattern.pattern.structural.decrator.v1;

/**
 * @author qiankeqin
 * @Description: 加了蛋的煎饼
 * @date 2019-02-02 23:04
 */
public class BattercakeWithEgg extends Battercake{
    @Override
    public String getDesc() {
        return super.getDesc()+",加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}