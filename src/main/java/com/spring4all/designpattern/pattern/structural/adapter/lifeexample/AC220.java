package com.spring4all.designpattern.pattern.structural.adapter.lifeexample;

/**
 * @author qiankeqin
 * @Description: 220V交流电
 * @date 2019-02-03 17:41
 */
public class AC220 {
    public int outputAc220(){
        System.out.println("输出交流电：220V电压");
        int output = 220;
        return output;
    }
}