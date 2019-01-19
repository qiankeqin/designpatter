package com.spring4all.designpattern.principle.liskovSubstitution;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-19 20:24
 **/
public class Child extends Base{
    /**
     * 重写
     * @param map
     */
//    @Override
//    public void method(HashMap map) {
//        System.out.println("子类HashMap入参被执行");
//    }

    /**
     * 重载
     * @param map
     */
    public void method(Map map) {
        System.out.println("子类Map入参被执行");
    }


}
