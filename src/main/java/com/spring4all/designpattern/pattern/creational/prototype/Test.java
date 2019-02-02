package com.spring4all.designpattern.pattern.creational.prototype;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-01 20:33
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化邮件模版");
        System.out.println("初始化："+mail);

        for(int i=0;i<10;i++){
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名"+i);
            mailTemp.setEmailAddress("姓名"+i+"@spring4all.xyz");
            mailTemp.setContent("恭喜：姓名"+i+"，中奖啦！！！");
            MailUtil.sendMail(mailTemp);
            System.out.println("克隆的:"+mailTemp);
        }

        //存储第一次的mail
        MailUtil.saveOriginMailRecord(mail);
    }
}