package com.spring4all.designpattern.pattern.creational.builder;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-01-21 21:35
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("Java设计模式",
                "Java设计模式PPT",
                "Java设计模式视频",
                "Java设计模式手记",
                "Java设计模式问答");

    }
}