package com.spring4all.designpattern.pattern.creational.singleton.hungry;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-01-25 13:15
 */
public class HungrySingleton {
    private final static HungrySingleton hungrySingleton ;

    static{
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}