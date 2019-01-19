package com.spring4all.designpattern.pattern.creational.simplefactory;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-19 22:25
 **/
public class JavaVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制java课程视频");
    }
}
