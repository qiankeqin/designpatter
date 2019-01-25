package com.spring4all.designpattern.pattern.creational.singleton.hungry;

import java.io.Serializable;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-01-25 13:15
 */
public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrySingleton ;

    static{
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton(){
        if(hungrySingleton!=null){
            throw new RuntimeException("单例模式，禁止反射调用！！！");
        }
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    private Object readResolve(){
        return hungrySingleton;
    }
}