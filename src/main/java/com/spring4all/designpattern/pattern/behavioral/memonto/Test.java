package com.spring4all.designpattern.pattern.behavioral.memonto;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-03-06 19:27
 */
public class Test {
    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();
        Article article = new Article("设计模式A-1","hello 工厂模式","123");
        //组装
        ArticleMemento articleMemento = article.saveToMemento();
        //存档1
        articleMementoManager.addMemento(articleMemento);
        System.out.println("标题："+article.getTitle()+" 内容："+article.getContent());
        System.out.println("手记完整信息："+article);

        System.out.println("修改手记start--------");
        article.setTitle("设计模式B");
        article.setContent("手记内容");

        System.out.println("修改手记end--------");
        System.out.println("手记完整信息："+article);
        articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        article.setTitle("设计模式C");
        article.setContent("手记内容C");
        article.setImgs("图片C");

        System.out.println("暂存回退start--------");
        System.out.println("回退出栈1次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("回退出栈2次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("暂存回退end");
        System.out.println("手记完整信息："+article);
    }
}