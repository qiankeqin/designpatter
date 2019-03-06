package com.spring4all.designpattern.pattern.behavioral.memonto;

import java.util.Stack;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-03-06 19:27
 */
public class ArticleMementoManager {
    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<>();

    public ArticleMemento getMemento(){
        ArticleMemento articleMemento = ARTICLE_MEMENTO_STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento){
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }
}