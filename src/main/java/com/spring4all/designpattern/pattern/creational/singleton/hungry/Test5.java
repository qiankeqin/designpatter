package com.spring4all.designpattern.pattern.creational.singleton.hungry;

import com.spring4all.designpattern.pattern.creational.singleton.LazySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-01-25 21:07
 */
public class Test5 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class objectClass = LazySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
        Field field = objectClass.getDeclaredField("flag");
        field.setAccessible(true);
        field.set(newInstance,true);

        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}