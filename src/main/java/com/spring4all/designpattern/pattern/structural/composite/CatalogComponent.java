package com.spring4all.designpattern.pattern.structural.composite;

/**
 * @author qiankeqin
 * @Description: 目录组件
 *  所有的方法留给子类进行实现
 *  如：如果一个组件是课程，那么就打印课程，如果是课程目录，那么就打印课程目录下面的课程
 * @date 2019-02-04 10:45
 */
public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持新增");
    }
    public void remove(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持删除");
    }
    public String getName(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取名称");
    }

    public double getPrice(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取价格");
    }
    public void print(){
        throw new UnsupportedOperationException("不支持打印");
    }


}