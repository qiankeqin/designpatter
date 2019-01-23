package com.spring4all.designpattern.pattern.creational.singleton;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-01-23 21:20
 */
public class ThreadTest1 implements Runnable{

    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+lazySingleton);
    }
}