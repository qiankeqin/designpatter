package com.spring4all.designpattern.pattern.structural.decrator.v2;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-02 23:31
 */
public class EggDecorator extends AbstractDecorator {
    /**
     * 因为抽象的装饰者没有无参构造起，所以具体装饰者必须重写有参构造器
     * @param battercacke
     */
    public EggDecorator(ABattercacke battercacke) {
        super(battercacke);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    public String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}