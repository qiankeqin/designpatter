package com.spring4all.designpattern.pattern.structural.bridge;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-11 15:59
 */
public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcBankAccount = icbcBank.openAccount();
        icbcBankAccount.showAccountType();


        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcBankAccount2 = icbcBank2.openAccount();
        icbcBankAccount2.showAccountType();


        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcBankAccount = abcBank.openAccount();
        abcBankAccount.showAccountType();



    }
}