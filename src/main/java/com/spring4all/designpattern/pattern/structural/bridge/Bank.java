package com.spring4all.designpattern.pattern.structural.bridge;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-11 15:41
 */
public abstract class Bank {
    protected Account account;
    public Bank(Account account){
        this.account = account;
    }

    /**
     * 开户
     * @return 开户对象
     */
    public abstract Account openAccount();
}