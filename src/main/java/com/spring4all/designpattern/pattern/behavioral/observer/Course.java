package com.spring4all.designpattern.pattern.behavioral.observer;

import java.util.Observable;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-03-04 20:29
 */
public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void produceQuestion(Course course,Question question){
        System.out.println(question.getUserName()+"在"+course.courseName+"上提了一个问题："+question.getQuestionContent());
        setChanged();
        notifyObservers(question);//传递具体的问题给观察者
    }
}