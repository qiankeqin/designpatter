package com.spring4all.designpattern.principle.openclose;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-18 19:23
 **/
public class JavaDiscountCourse extends JavaCource{

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return 0.75 * super.getPrice();
    }
}
