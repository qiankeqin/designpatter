package com.spring4all.designpattern.pattern.structural.adapter.objectadapter;

import com.spring4all.designpattern.pattern.structural.adapter.classadapter.Target;

/**
 * @author qiankeqin
 * @Description: 具体的目标对象
 * @date 2019-02-03 17:15
 */
public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("ConcreteTarget目标方法");
    }
}