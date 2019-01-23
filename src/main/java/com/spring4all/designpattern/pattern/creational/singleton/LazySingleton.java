package com.spring4all.designpattern.pattern.creational.singleton;

/**
 * @author qiankeqin
 * @Description: 懒汉模式单例
 * @date 2019-01-23 21:15
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){

    }

    public synchronized static LazySingleton getInstance(){
        if(null == lazySingleton){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}