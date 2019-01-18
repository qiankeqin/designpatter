package com.spring4all.designpattern.principle.dependenceinversion;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-18 20:08
 **/
public class Qen {
    //v1
//    public void studyJavaCourse(){
//        System.out.println("Qen在学习Java课程");
//    }
//
//    public void studyTestCourse(){
//        System.out.println("Qen在学习Test课程");
//    }
//
//    public void studyPythonCourse(){
//        System.out.println("Qen在学习Python课程");
//    }

//
//    public void studyCourse(ICourse course){
//        course.studyCourse();
//    }

    private ICourse iCourse;

    public Qen(ICourse iCourse){
        this.iCourse = iCourse;
    }

    public void setCourse(ICourse iCourse){
        this.iCourse = iCourse;
    }


    public void studyCourse(){
        iCourse.studyCourse();
    }
}
