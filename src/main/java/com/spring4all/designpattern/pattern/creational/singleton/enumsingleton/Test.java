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
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());
        System.out.println(instance.getData());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        EnumInstance newInstance = (EnumInstance) ois.readObject();
        System.out.println(newInstance.getData());

        System.out.println(instance.getData() == newInstance.getData());
    }
}