package com.spring4all.designpattern.pattern.creational.prototype.abstractprototype;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-01 21:55
 */
public class B extends A {

    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        Object clone = b.clone();
    }
}