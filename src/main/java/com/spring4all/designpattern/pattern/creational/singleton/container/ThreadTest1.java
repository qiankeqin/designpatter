package com.spring4all.designpattern.pattern.creational.singleton.container;

import com.spring4all.designpattern.pattern.creational.singleton.doublecheck.LazyDoubleCheckSingleton;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-01-23 21:20
 */
public class ThreadTest1 implements Runnable{

    @Override
    public void run() {
        ContainerSingleton.putInstance("container",new Object());
        Object containerSingleton = ContainerSingleton.getInstance("container");
        System.out.println(Thread.currentThread().getName()+" "+containerSingleton);
    }
}