package com.spring4all.designpattern.pattern.behavioral.templatemethod;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-02-19 13:18
 */
public class FECourse extends ACourse {

    private boolean needWriteArticleFlag = false;

    @Override
    void packageCourse() {
        System.out.println("提供前端代码");
        System.out.println("提供图片等源文件");
    }

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}