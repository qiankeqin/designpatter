package com.spring4all.designpattern.pattern.behavioral.observer;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-03-04 21:03
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("Java设计模式");
        Teacher teacher = new Teacher("Peter");
        Teacher teacher2 = new Teacher("Linda");
        course.addObserver(teacher);
        course.addObserver(teacher2);

        //业务逻辑代码
        Question question = new Question();
        question.setQuestionContent("Java面试题？");
        question.setUserName("xiao ding");

        course.produceQuestion(course,question);
    }
}