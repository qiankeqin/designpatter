package com.spring4all.designpattern.principle.dependenceinversion;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-18 20:19
 **/
public class TestCourse implements ICourse{

    @Override
    public void studyCourse() {
        System.out.println("学习Test课程");
    }
}
