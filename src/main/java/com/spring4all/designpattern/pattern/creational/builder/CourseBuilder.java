package com.spring4all.designpattern.pattern.creational.builder;

/**
 * @author qiankeqin
 * @Project: design-pattern
 * @Package com.spring4all.designpattern.pattern.creational.builder
 * @Description: TODO
 * @date 2019-01-21 21:03
 */
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);

    public abstract void buildCoursePPT(String coursePPT);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}