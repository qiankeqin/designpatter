package com.spring4all.designpattern.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-01 19:59
 */
public class MailUtil {
    public static void sendMail(Mail mail){
        String outputContent="To: {0} , emailAddress:{1}, content:{2} -----发送成功";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getEmailAddress(),mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail){
        System.out.println("存储原始邮件模版"+mail.getContent());
    }
}