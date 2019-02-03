package com.spring4all.designpattern.pattern.structural.decrator.v2;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-02 23:42
 */
public class Test {
    public static void main(String[] args) {
        ABattercacke aBattercacke;
        aBattercacke = new Battercake();
        //由于实现了被装饰者，实现了构造方法，所以此时可以传入被装饰者
        aBattercacke = new EggDecorator(aBattercacke);
        //上面返回的对象是装饰后的对象，所以aBattercacke是已经加了一个鸡蛋的对象了
        //下面继续对被装饰者进行装饰，那么此时的aBattercacke就变为两个鸡蛋了
        aBattercacke = new EggDecorator(aBattercacke);
        aBattercacke = new SausageDecorator(aBattercacke);

        System.out.println("煎饼："+aBattercacke.getDesc()+",销售价格："+aBattercacke.cost());
    }
}