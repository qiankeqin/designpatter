package com.spring4all.designpattern.pattern.structural.adapter.lifeexample;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-03 17:55
 */
public class Test {
    public static void main(String[] args) {
        DC5V dc5V = new PowerAdapter();
        dc5V.outputDc5V();
    }
}