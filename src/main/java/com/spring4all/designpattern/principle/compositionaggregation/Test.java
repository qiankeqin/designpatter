package com.spring4all.designpattern.principle.compositionaggregation;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-19 21:18
 **/
public class Test {
    public static void main(String[] args) {
        ProductDao dao = new ProductDao(new PostgreConnection());
        dao.addProduct();
    }
}
