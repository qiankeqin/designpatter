package com.spring4all.designpattern.pattern.creational.singleton.threadlocal;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-01-23 21:20
 */
public class ThreadTest1 implements Runnable{

    @Override
    public void run() {
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+instance);
    }
}