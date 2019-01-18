package com.spring4all.designpattern.principle.dependenceinversion;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-18 20:11
 **/
public class QenTest {



//    public static void main(String[] args) {
////        Qen qen = new Qen();
//////        qen.studyJavaCourse();
//////        qen.studyTestCourse();
////
////        qen.studyCourse(new JavaCourse());
////        qen.studyCourse(new PythonCourse());
//
//        new Qen(new JavaCourse()).studyCourse();
//        new Qen(new TestCourse()).studyCourse();
//        new Qen(new PythonCourse()).studyCourse();
//
//    }

    public static void main(String[] args) {
        Qen qen = new Qen(new JavaCourse());
        qen.studyCourse();
        qen.setCourse(new PythonCourse());
        qen.studyCourse();
        qen.setCourse(new TestCourse());
        qen.studyCourse();
    }

}
