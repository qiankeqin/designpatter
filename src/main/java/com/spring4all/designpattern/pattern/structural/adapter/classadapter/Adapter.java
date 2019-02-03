package com.spring4all.designpattern.pattern.structural.adapter.classadapter;

/**
 * @author qiankeqin
 * @Description: 适配器：将Adaptee适配成Target
 * @date 2019-02-03 17:17
 */
public class Adapter extends Adaptee implements Target{

    //通过Adaptee，将adapteeRequest适配给了Target
    @Override
    public void request() {
        super.adapteeRequest();
    }
}