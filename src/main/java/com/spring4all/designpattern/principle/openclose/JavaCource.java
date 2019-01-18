package com.spring4all.designpattern.principle.openclose;

/**
 * @program: design-pattern
 * @description: java课程
 * @author: qiankeqin
 * @create: 2019-01-18 19:03
 **/
public class JavaCource implements ICourse{
    private Integer id;
    private String name;
    private Double price;

    public JavaCource(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return 0.8*this.price;
    }

}
