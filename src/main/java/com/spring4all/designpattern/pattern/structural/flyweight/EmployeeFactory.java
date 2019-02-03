package com.spring4all.designpattern.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-03 19:09
 */
public class EmployeeFactory {
    private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department){
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if(null==manager){
            System.out.print("创建部门经理："+department);
            manager = new Manager(department);
            String content = department+"部门经理正在汇报。。。。。。";
            manager.setReportContent(content);
            System.out.println(" 创建报告，"+content);
            EMPLOYEE_MAP.put(department,manager);
        }
        return manager;
    }
}