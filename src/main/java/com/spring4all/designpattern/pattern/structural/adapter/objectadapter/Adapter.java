package com.spring4all.designpattern.pattern.structural.adapter.objectadapter;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-03 17:35
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}