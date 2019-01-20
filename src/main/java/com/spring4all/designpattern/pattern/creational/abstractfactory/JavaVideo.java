package com.spring4all.designpattern.pattern.creational.abstractfactory;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-20 20:49
 **/
public class JavaVideo extends Video{
    @Override
    void produce() {
        System.out.println("生产Java视频课程");
    }
}
