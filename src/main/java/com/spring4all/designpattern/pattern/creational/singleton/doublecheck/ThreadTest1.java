package com.spring4all.designpattern.pattern.creational.singleton.doublecheck;

import com.spring4all.designpattern.pattern.creational.singleton.LazySingleton;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-01-23 21:20
 */
public class ThreadTest1 implements Runnable{

    @Override
    public void run() {
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+lazyDoubleCheckSingleton);
    }
}