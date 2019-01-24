package com.spring4all.designpattern.pattern.creational.singleton.doublecheck;

/**
 * @author qiankeqin
 * @Description: 懒汉模式单例
 * @date 2019-01-23 21:15
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton(){

    }

    public static LazyDoubleCheckSingleton getInstance(){
        if(null == lazyDoubleCheckSingleton){
            synchronized (LazyDoubleCheckSingleton.class){
                if(null == lazyDoubleCheckSingleton){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}