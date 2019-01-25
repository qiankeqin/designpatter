package com.spring4all.designpattern.pattern.creational.singleton.staticinnerclass;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-01-24 21:21
 */
public class StaticInnerClassSingleton {
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

    /**
     * 私有构造函数必须有
     */
    private StaticInnerClassSingleton(){

    }
}