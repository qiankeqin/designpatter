package com.spring4all.designpattern.pattern.behavioral.memonto;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-03-06 19:27
 */
public class ArticleMemento {
    private String title;
    private String content;
    private String imgs;

    public ArticleMemento() {
    }


    public ArticleMemento(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
        this.imgs = article.getImgs();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    @Override
    public String toString() {
        return "ArticleMemento{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", imgs='" + imgs + '\'' +
                '}';
    }
}