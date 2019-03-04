package com.spring4all.designpattern.pattern.behavioral.interpreter;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-03-01 13:15
 */
public class Test {
    public static void main(String[] args) {
        String inputStr = "6 10 12 + *";
        AdminExpressionParser adminExpressionParser = new AdminExpressionParser();
        int result = adminExpressionParser.parse(inputStr);
        System.out.println(String.format("结果： %s",result));
    }
}