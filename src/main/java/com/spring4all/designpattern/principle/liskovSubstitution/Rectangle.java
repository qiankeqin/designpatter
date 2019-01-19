package com.spring4all.designpattern.principle.liskovSubstitution;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @program: design-pattern
 * @description: 长方形
 * @author: qiankeqin
 * @create: 2019-01-19 19:42
 **/
public class Rectangle implements QuadRangle{
    private long length;
    private long width;

    @Override
    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
