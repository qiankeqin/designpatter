package com.spring4all.designpattern.pattern.structural.decrator.v2;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-02 23:27
 */
public abstract class AbstractDecorator extends ABattercacke{

    private ABattercacke battercacke;

    /**
     * 通过构造器将具体的煎饼放进到抽象煎饼中
     * @param battercacke
     */
    public AbstractDecorator(ABattercacke battercacke) {
        this.battercacke = battercacke;
    }

    protected abstract void doSomething();

    //调用委托的抽象煎饼
    @Override
    public String getDesc() {
        return battercacke.getDesc();
    }

    @Override
    public int cost() {
        return battercacke.cost();
    }
}