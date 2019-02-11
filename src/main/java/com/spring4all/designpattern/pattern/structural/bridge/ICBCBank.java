package com.spring4all.designpattern.pattern.structural.bridge;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-11 15:45
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account){
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("打开中国工商银行账户");
        account.openAccount();
        return account;
    }
}