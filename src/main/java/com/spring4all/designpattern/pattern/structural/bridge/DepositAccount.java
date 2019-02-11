package com.spring4all.designpattern.pattern.structural.bridge;

/**
 * @author qiankeqin
 * @Description: 定期账号
 * @date 2019-02-11 15:38
 */
public class DepositAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开一个定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}