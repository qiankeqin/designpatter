package com.spring4all.designpattern.pattern.behavioral.interpreter;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-03-01 13:15
 */
public class OperatorUtil {
    public static boolean isOperator(String item) {
        return (item.equals("+") || item.equals("*"));
    }

    public static Interpreter getExpression(Interpreter firstExpression,Interpreter secondExpression,String symbol) {
        if(symbol.equals("+")){
            return new AddInterpreter(firstExpression,secondExpression);
        } else if(symbol.equals("*")){
            return new MultiInterpreter(firstExpression,secondExpression);
        }
        return null;
    }
}