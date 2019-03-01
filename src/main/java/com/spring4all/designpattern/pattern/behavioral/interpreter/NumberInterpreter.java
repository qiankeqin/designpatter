package com.spring4all.designpattern.pattern.behavioral.interpreter;

/**
 * @author qiankeqin
 * @Description: 数值解释器
 * @date 2019-03-01 13:15
 */
public class NumberInterpreter implements Interpreter {
    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    public NumberInterpreter(String num){
        this.number = Integer.parseInt(num);
    }

    @Override
    public int interpret() {
        return this.number;
    }
}