package com.spring4all.designpattern.pattern.creational.prototype.clone;

import com.spring4all.designpattern.pattern.creational.singleton.hungry.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-02 12:50
 */
public class Test1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);

        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);

        System.out.println(hungrySingleton);
        System.out.println(cloneHungrySingleton);
    }
}