package com.spring4all.designpattern.pattern.structural.decrator.v1;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-02 23:07
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc()+"，销售价格:"+battercake.cost());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc()+"，销售价格:"+battercakeWithEgg.cost());

        Battercake battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc()+"，销售价格:"+battercakeWithEggSausage.cost());

    }
}