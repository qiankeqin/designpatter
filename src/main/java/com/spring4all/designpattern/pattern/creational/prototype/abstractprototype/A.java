package com.spring4all.designpattern.pattern.creational.prototype.abstractprototype;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-01 21:54
 */
public abstract class A implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}