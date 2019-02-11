package com.spring4all.designpattern.pattern.structural.bridge;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-11 15:38
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}