package com.spring4all.designpattern.principle.liskovSubstitution.output;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-19 20:57
 **/
public class Child extends Base{
    @Override
    public Map returnMap() {
        HashMap hashMap = new HashMap();
        System.out.println("子类method被执行");
        hashMap.put("message","子类method被执行");
        return hashMap;
    }
}
