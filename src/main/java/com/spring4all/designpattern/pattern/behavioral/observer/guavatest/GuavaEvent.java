package com.spring4all.designpattern.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.Subscribe;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-03-05 13:11
 */
public class GuavaEvent {
    @Subscribe
    public void  subscribe(String str){
        //业务逻辑
        System.out.println("执行subscribe方法，传入的参数是："+str);
    }
}