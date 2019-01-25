package com.spring4all.designpattern.pattern.creational.singleton.staticinnerclass;


/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-01-23 21:19
 */
public class Test {
    public static void main(String[] args) {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        System.out.println(lazySingleton);
        Thread t1 = new Thread(new ThreadTest1());
        Thread t2 = new Thread(new ThreadTest1());
        t1.start();
        t2.start();
        System.out.println("Program end");
    }
}