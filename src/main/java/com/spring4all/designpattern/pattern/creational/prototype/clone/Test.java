package com.spring4all.designpattern.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-01 22:08
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(0L);
        Pig pig1 = new Pig("佩琦",date);
        Pig pig2 = (Pig) pig1.clone();

        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(66666666L);

        System.out.println(pig1);
        System.out.println(pig2);

    }
}