package com.spring4all.designpattern.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-19 10:39
 **/
public class TeamLeader {
    public void checkNumberOfCourses(){
        List<Course> courses = new ArrayList<>();
        for(int i=0; i<20; i++){
            courses.add(new Course());
        }
        System.out.println("在线课程的数量是："+courses.size());
    }
}
