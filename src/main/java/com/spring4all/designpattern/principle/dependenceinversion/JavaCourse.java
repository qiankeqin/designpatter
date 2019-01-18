package com.spring4all.designpattern.principle.dependenceinversion;

/**
 * @program: design-pattern
 * @description: java课程
 * @author: qiankeqin
 * @create: 2019-01-18 20:19
 **/
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习Java课程");
    }
}
