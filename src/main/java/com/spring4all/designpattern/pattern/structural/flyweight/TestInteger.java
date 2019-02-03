package com.spring4all.designpattern.pattern.structural.flyweight;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-03 19:37
 */
public class TestInteger {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;

        System.out.println("a==b?"+(a==b));
        System.out.println("c==d?"+(c==d));
    }
}