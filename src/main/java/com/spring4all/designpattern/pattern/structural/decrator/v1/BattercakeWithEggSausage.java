package com.spring4all.designpattern.pattern.structural.decrator.v1;

/**
 * @author qiankeqin
 * @Description: 煎饼+鸡蛋+香肠
 * @date 2019-02-02 23:06
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg{
    @Override
    public String getDesc() {
        return super.getDesc() + "，加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}