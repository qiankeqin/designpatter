package com.spring4all.designpattern.pattern.behavioral.iterator;

import java.util.List;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-27 19:29
 */
public class CourseIteratorImpl implements CourseIterator {

    private List courseList;
    int position;
    Course course;

    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("返回课程，位置是："+position);
        course = (Course) courseList.get(position);
        position++;
        return course;
    }

    @Override
    public boolean isLastCourse() {
        if(position< courseList.size()){
            return false;
        }
        return true;
    }
}