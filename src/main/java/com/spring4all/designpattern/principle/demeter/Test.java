package com.spring4all.designpattern.principle.demeter;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-19 10:45
 **/
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.commandCheckNumber(new TeamLeader());
    }
}
