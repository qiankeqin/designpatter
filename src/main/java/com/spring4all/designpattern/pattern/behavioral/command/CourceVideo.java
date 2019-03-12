package com.spring4all.designpattern.pattern.behavioral.command;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-03-12 13:16
 */
public class CourceVideo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println(this.name+"课程的视频开放");
    }

    public void close(){
        System.out.println(this.name+"课程的视频关闭");
    }
}