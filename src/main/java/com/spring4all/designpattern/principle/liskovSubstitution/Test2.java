package com.spring4all.designpattern.principle.liskovSubstitution;

import java.util.HashMap;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-19 20:31
 **/
public class Test2 {
    public static void main(String[] args) {
        Base child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}
