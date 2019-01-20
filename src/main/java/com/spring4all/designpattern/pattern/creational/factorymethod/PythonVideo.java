package com.spring4all.designpattern.pattern.creational.factorymethod;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-19 22:26
 **/
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程");
    }
}
