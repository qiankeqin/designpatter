package com.spring4all.designpattern.pattern.creational.singleton.container;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-01-24 13:22
 */
public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadTest1());
        Thread t2 = new Thread(new ThreadTest1());
        t1.start();
        t2.start();
        System.out.println("Program end");
    }
}