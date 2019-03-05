package com.spring4all.designpattern.pattern.behavioral.observer;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-03-04 20:30
 */
public class Question {
    private String userName;
    private String questionContent;

    public Question() {
    }

    public Question(String userName, String questionContent) {
        this.userName = userName;
        this.questionContent = questionContent;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}