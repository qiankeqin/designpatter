package com.spring4all.designpattern.pattern.creational.abstractfactory;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-20 20:54
 **/
public class PythonVideo extends Video{
    @Override
    void produce() {
        System.out.println("生产Python录制视频");
    }
}
