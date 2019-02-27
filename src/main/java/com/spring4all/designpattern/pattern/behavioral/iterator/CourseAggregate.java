package com.spring4all.designpattern.pattern.behavioral.iterator;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-27 19:26
 */
public interface CourseAggregate{
    void addCourse(Course course);
    void removeCourse(Course course);
    CourseIterator getCourseIterator();
}
