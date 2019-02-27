package com.spring4all.designpattern.pattern.behavioral.iterator;

/**
 * @author qiankeqin
 * @Description: 迭代器接口
 * @date 2019-02-27 19:24
 */
public interface CourseIterator {
    Course nextCourse();
    boolean isLastCourse();
}
