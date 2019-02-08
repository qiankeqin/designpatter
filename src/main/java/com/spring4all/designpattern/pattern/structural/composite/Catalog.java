package com.spring4all.designpattern.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiankeqin
 * @Description: 课程目录
 * 课程目录可以实现课程组件中所有的操作,唯一没有的是获取价格
 * @date 2019-02-04 10:51
 */
public class Catalog extends CatalogComponent{

    private List<CatalogComponent> catalogComponents = new ArrayList<>();

    //m目录名称
    private String name;

    //目录级别
    private Integer level;


    public Catalog(String name,Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        catalogComponents.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        catalogComponents.remove(catalogComponent);
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return "课程目录:"+this.name;
    }

    @Override
    public void print() {
        System.out.println("课程目录："+this.name);
        catalogComponents.forEach(item->{
            if(null!=this.level){
                for(int i=0;i<=this.level;i++){
                    System.out.print("  ");
                }
            }
            item.print();
        });
    }
}