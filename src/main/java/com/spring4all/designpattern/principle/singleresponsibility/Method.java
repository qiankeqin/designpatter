package com.spring4all.designpattern.principle.singleresponsibility;

/**
 * @program: design-pattern
 * @description:
 * @author: qiankeqin
 * @create: 2019-01-18 21:34
 **/
public class Method {
    /**
     * 更新名字和地址
     * @param username
     * @param address
     */
    private void updateUserInfo(String username,String address){
        username = "hell0";
        address = "zhejiang";
    }

    private void updateUserInfo(String userName,String... properties){

    }

    /**
     * 更新名字
     * @param username
     */
    public void updateUserName(String username){
        username = "zhongguo";
    }

    /**
     * 更新地址
     * @param address
     */
    public void updateUserAddress(String address){
        address = "zhejigna2";
    }

    /**
     * 多职责，建议拆分
     * @param userName
     * @param address
     * @param bool
     */
    public void updateUserInfo(String userName,String address,boolean bool){
        if(bool){
            //todosomething
        } else {
            //todosomething
        }
    }
}
