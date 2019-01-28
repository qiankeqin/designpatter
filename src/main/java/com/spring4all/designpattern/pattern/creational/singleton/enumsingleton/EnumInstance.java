package com.spring4all.designpattern.pattern.creational.singleton.enumsingleton;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-01-25 21:24
 */
public enum EnumInstance {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }

}