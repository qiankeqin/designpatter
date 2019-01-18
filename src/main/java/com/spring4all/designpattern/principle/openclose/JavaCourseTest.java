package com.spring4all.designpattern.principle.openclose;

import com.spring4all.designpattern.principle.openclose.ICourse;
import com.spring4all.designpattern.principle.openclose.JavaCource;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-18 19:08
 **/
public class JavaCourseTest {
    public static void main(String[] args) {
//        ICourse javaCourse = new JavaCource(96,"Java从入门到劝退",348d);
        ICourse iCourse = new JavaDiscountCourse(96,"Java从入门到劝退",348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID："+javaCourse.getId()+",课程名称:"+javaCourse.getName()+"，课程折扣价格:"+javaCourse.getPrice()+
                "元, 原价："+ javaCourse.getOriginPrice() +"元");
    }
}
