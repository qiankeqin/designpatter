package com.spring4all.designpattern.pattern.structural.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-15 19:56
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    //声明一个目标对象
    private Object target;

    public OrderServiceDynamicProxy(Object target){
        //赋值对象
        this.target = target;
    }

    public Object bind(){
        Class cls = target.getClass();//目标类的类
        //反射
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }

    /**
     * 参数1：写invoke方法实现的时候基本用不上，那为啥传递呢？
     * 参数2：要被增强的方法对象
     * 参数3：具体的method的参数
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return null;
    }
}