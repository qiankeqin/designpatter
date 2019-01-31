package com.spring4all.designpattern.pattern.creational.singleton.threadlocal;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-01-31 12:50
 */
public class ThreadLocalInstance {
    //声明并初始化ThreadLocal对象
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstance
            = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance(){

    }

    public static ThreadLocalInstance getInstance(){
        return threadLocalInstance.get();
    }

}