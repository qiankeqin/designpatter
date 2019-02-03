package com.spring4all.designpattern.pattern.structural.adapter.lifeexample;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-03 17:45
 */
public class PowerAdapter implements DC5V {

    private AC220 ac220 = new AC220();

    /**
     * 将220V交流电转化为5V直流电
     * @return
     */
    @Override
    public int outputDc5V() {
        int adapterInput = ac220.outputAc220();
        //转换开始
        int adapteredOutput = adapterInput/44;
        //转换结束
        System.out.println("使用PowerAdapter对电压进行转换后：直流电："+adapteredOutput+"V");

        return adapteredOutput;
    }
}