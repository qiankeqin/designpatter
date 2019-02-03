package com.spring4all.designpattern.pattern.structural.flyweight;

/**
 * @author qiankeqin
 * @Description: 部门管理者
 * @date 2019-02-03 19:07
 */
public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println(reportContent);
    }

    /**
     * 内部变量
     */
    private String title = "部门经理";
    /**
     * 部门
     */
    private String department;
    /**
     * 报告内容
     */
    private String reportContent;

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }
}