package com.spring4all.designpattern.principle.liskovSubstitution;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-19 20:23
 **/
public class Base {
    public void method(HashMap map){
        System.out.println("父类被执行");
    }
}
