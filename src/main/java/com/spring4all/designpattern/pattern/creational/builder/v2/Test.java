package com.spring4all.designpattern.pattern.creational.builder.v2;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-01-21 21:59
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("Java").buildCourseArticle("Java劝退").buildCoursePPT("Java之入门到放弃").buildCourseQA("weishenm").build();
        System.out.println(course);
    }
}