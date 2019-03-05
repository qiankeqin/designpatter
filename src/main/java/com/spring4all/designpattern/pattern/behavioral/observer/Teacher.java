package com.spring4all.designpattern.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-03-04 20:30
 */
public class Teacher implements Observer {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName+"老师的"+course.getCourseName()+"课程接收到一个"+question.getUserName()+"的问题,问题是："+question.getQuestionContent());
    }
}