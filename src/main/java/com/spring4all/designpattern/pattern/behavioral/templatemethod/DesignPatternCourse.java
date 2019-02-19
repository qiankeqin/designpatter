package com.spring4all.designpattern.pattern.behavioral.templatemethod;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-19 13:18
 */
public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}