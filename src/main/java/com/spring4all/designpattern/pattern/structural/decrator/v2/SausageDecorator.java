package com.spring4all.designpattern.pattern.structural.decrator.v2;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-02 23:31
 */
public class SausageDecorator extends AbstractDecorator{
    public SausageDecorator(ABattercacke battercacke) {
        super(battercacke);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    public String getDesc() {
        return super.getDesc() + "加一个香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 3;
    }
}