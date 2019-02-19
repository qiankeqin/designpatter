package com.spring4all.designpattern.pattern.behavioral.templatemethod;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-19 13:20
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Java设计模式start");
        ACourse course = new DesignPatternCourse();
        course.makeCourse();
        System.out.println("Java设计模式end");
        System.out.println("前端课程start");
        ACourse course2 = new FECourse(false);
        course2.makeCourse();
        System.out.println("前端课程end");
        System.out.println("前端课程2start");
        ACourse course3 = new FECourse(true);
        course3.makeCourse();
        System.out.println("前端课程2end");
    }
}