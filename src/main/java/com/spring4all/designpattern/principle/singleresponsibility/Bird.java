package com.spring4all.designpattern.principle.singleresponsibility;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-18 20:56
 **/
public class Bird {
    public void mainMoveMod(String name){
        if("鸵鸟".equals(name)){
            System.out.println("bird:"+name+"用脚走");
        } else {
            System.out.println("bird:"+name+"用翅膀飞");
        }
    }
}
