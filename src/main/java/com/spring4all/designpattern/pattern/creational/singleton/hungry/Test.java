package com.spring4all.designpattern.pattern.creational.singleton.hungry;

import java.io.*;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-01-25 19:43
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungrySingleton instance = HungrySingleton.getInstance();
        System.out.println(instance);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
        System.out.println(newInstance);
    }
}