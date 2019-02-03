package com.spring4all.designpattern.pattern.structural.adapter.classadapter;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-03 17:22
 */
public class Test {
    public static void main(String[] args) {
        //直接实现
        Target target = new ConcreteTarget();
        target.request();

        //通过适配实现
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter();
        adapter.request();
    }


}