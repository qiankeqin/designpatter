package com.spring4all.designpattern.pattern.structural.decrator.v2;

/**
 * @author qiankeqin
 * @Description: 具体的被装饰者
 * @date 2019-02-02 23:23
 */
public class Battercake extends ABattercacke {
    @Override
    public String getDesc() {
        return "煎饼";
    }

    @Override
    public int cost() {
        return 8;
    }
}