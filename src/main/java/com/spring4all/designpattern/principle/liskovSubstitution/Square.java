package com.spring4all.designpattern.principle.liskovSubstitution;

/**
 * @program: design-pattern
 * @description: 正方形
 * @author: qiankeqin
 * @create: 2019-01-19 19:42
 **/
public class Square {
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }
}
