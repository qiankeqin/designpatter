package com.spring4all.designpattern.principle.singleresponsibility;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-18 21:28
 **/
public class CourseImpl implements ICourseContent,ICourseManage{
    @Override
    public String getCoursename() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
