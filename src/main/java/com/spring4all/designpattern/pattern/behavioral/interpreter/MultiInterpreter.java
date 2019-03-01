package com.spring4all.designpattern.pattern.behavioral.interpreter;

/**
 * @author qiankeqin
 * @Description: 乘法解释器
 * @date 2019-03-01 13:15
 */
public class MultiInterpreter implements Interpreter{
    private Interpreter firstExpression;
    private Interpreter secondExpression;

    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret() * this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "*";
    }
}