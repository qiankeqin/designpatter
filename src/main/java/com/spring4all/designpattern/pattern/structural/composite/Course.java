package com.spring4all.designpattern.pattern.structural.composite;

/**
 * @author qiankeqin
 * @Description: 课程
 * 课程本身不能添加课程和删除课程，但是可以获取名称，价格，打印
 * @date 2019-02-04 10:48
 */
public class Course extends CatalogComponent {
    private double price;
    private String name;

    public Course( String name,double price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("课程："+this.name+", 价格："+this.price);
    }
}