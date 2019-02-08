package com.spring4all.designpattern.pattern.structural.composite;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-04 11:06
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("linux系统课程",100);
        CatalogComponent windowCourse = new Course("window系统课程",99);

        CatalogComponent javaCatalog = new Catalog("java课程目录",1);
        CatalogComponent java1 = new Course("java1期",30);
        CatalogComponent java2 = new Course("java2期",40);
        CatalogComponent javaDesignPattern = new Course("java设计模式",33);
        javaCatalog.add(java1);
        javaCatalog.add(java2);
        javaCatalog.add(javaDesignPattern);

        //这里的添加操作和打印操作类似，屏蔽了添加课程或者添加课程目录
        CatalogComponent mainCatalog = new Catalog("主目录",0);
        mainCatalog.add(linuxCourse);
        mainCatalog.add(windowCourse);
        mainCatalog.add(javaCatalog);//添加java课程目录

        mainCatalog.print();
    }
}