package com.spring4all.designpattern.pattern.structural.bridge;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-11 15:44
 */
public class ABCBank extends Bank {

    public ABCBank(Account account){
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}