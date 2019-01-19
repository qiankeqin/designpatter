package com.spring4all.designpattern.principle.liskovSubstitution.output;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-19 20:56
 **/
public class Base {
    public Map returnMap(){
        return new HashMap();
    }
}
