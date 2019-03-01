package com.spring4all.designpattern.pattern.behavioral.interpreter;

/**
 * @author qiankeqin
 * @Description: 加法解释器
 * @date 2019-03-01 13:14
 */
public class AddInterpreter implements Interpreter {
    private Interpreter firstExpression;
    private Interpreter secondExpression;

    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        //两个表达式解释的加法
        return this.firstExpression.interpret() + this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "+";
    }
}