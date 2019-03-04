package com.spring4all.designpattern.pattern.behavioral.interpreter;

import java.util.Stack;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-03-01 13:14
 */
public class AdminExpressionParser {
    //声明一个栈，内部放解释器
    private Stack<Interpreter> stack = new Stack<>();

    public int parse(String str){
        String[] strItemArray = str.split(" ");
        for (String item : strItemArray) {
            if(!OperatorUtil.isOperator(item)){
                Interpreter numberExpression = new NumberInterpreter(item);
                stack.push(numberExpression);
                System.out.println(String.format("入栈 %d",numberExpression.interpret()));
            } else {
                //是运算符，可以进行运算
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.println(String.format("出栈 %d和%d",firstExpression.interpret(),secondExpression.interpret()));
                Interpreter operator = OperatorUtil.getExpression(firstExpression,secondExpression,item);
                System.out.println(String.format("应用运算符 %s",item));
                int result = operator.interpret();
                NumberInterpreter numberInterpreter = new NumberInterpreter(result);
                stack.push(numberInterpreter);
                System.out.println(String.format("阶段结果入栈：%d",result));
            }
        }
        int result = stack.pop().interpret();
        return result;
    }
}