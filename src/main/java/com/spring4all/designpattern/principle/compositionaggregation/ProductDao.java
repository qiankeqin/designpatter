package com.spring4all.designpattern.principle.compositionaggregation;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-19 21:17
 **/
public class ProductDao{

    private DBConnection dbConnection;

    public ProductDao(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        String connection = dbConnection.getConnection();
        System.out.println("使用"+connection+"增加产品");
    }
}
