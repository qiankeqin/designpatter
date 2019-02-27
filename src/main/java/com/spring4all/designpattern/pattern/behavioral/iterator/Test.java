package com.spring4all.designpattern.pattern.behavioral.iterator;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-27 19:39
 */
public class Test {
    public static void main(String[] args) {
        Course course1 = new Course("hello 123");
        Course course2 = new Course("Java");
        Course course3 = new Course("CPP");
        Course course4 = new Course("Python");
        Course course5 = new Course("算法");
        Course course6 = new Course("qianduan");

        CourseAggregate courseAggregate = new CourseAggregateImpl();
        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        courseAggregate.addCourse(course6);

        printCourses(courseAggregate);

        System.out.println("--------删除课程后----------");
        courseAggregate.removeCourse(course1);
        printCourses(courseAggregate);

    }

    public static void printCourses(CourseAggregate courseAggregate){
        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while(!courseIterator.isLastCourse()){
            Course course = courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }
}