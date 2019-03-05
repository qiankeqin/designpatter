package com.spring4all.designpattern.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.EventBus;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-03-05 13:12
 */
public class GuavaEventTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        //注册观察者
        eventBus.register(guavaEvent);
        eventBus.post("post啥来着？");
    }
}