package com.spring4all.designpattern.pattern.creational.singleton.enumsingleton;

import com.spring4all.designpattern.pattern.creational.singleton.hungry.HungrySingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-01-25 20:31
 */
public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objectClass = EnumInstance.class;
        Constructor constructor = objectClass.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        EnumInstance newInstance = (EnumInstance) constructor.newInstance("Test",2);
        System.out.println(newInstance);
    }
}