package com.spring4all.designpattern.pattern.creational.abstractfactory;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-20 20:50
 **/
public class JavaArticle extends Article{
    @Override
    void produce() {
        System.out.println("生产Java手记");
    }
}
