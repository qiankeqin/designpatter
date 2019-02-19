package com.spring4all.designpattern.pattern.behavioral.templatemethod;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-19 13:13
 */
public abstract class ACourse {

    /**
     * 设置成final，是不想被重写修改
     */
    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if(needWriteArticle()){//使用钩子方法
            this.makeArticle();
        }
        this.packageCourse();
    }

    //分步骤
    final void makePPT(){
        System.out.println("制作PPT");
    }

    final void makeVideo(){
        System.out.println("制作视频");
    }

    final void makeArticle(){
        System.out.println("编写手记");
    }

    //钩子方法
    protected boolean needWriteArticle(){
        return false;
    }

    /**
     * 包装课程
     */
    abstract void packageCourse();


}