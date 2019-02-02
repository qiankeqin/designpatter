package com.spring4all.designpattern.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-01 22:05
 */
public class Pig implements Cloneable {

    private String name;
    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}'+super.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();

        //深克隆
        pig.birthday = (Date) pig.getBirthday().clone();
        return pig;
    }
}