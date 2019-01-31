package com.spring4all.designpattern.pattern.creational.singleton.threadlocal;


/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-01-23 21:19
 */
public class Test {
    public static void main(String[] args) {

        System.out.println("Main "+ThreadLocalInstance.getInstance());
        System.out.println("Main "+ThreadLocalInstance.getInstance());
        System.out.println("Main "+ThreadLocalInstance.getInstance());
        System.out.println("Main "+ThreadLocalInstance.getInstance());
        System.out.println("Main "+ThreadLocalInstance.getInstance());

        Thread t1 = new Thread(new ThreadTest1());
        Thread t2 = new Thread(new ThreadTest1());
        t1.start();
        t2.start();
        System.out.println("Program end");
    }
}