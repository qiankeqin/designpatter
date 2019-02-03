package com.spring4all.designpattern.pattern.structural.flyweight;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-03 19:13
 */
public class Test {
    private static final String departments[] = {"QA","DEV","PM","RD"};

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            String department = departments[(int) (Math.random() * departments.length)];
            Employee manager = EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}