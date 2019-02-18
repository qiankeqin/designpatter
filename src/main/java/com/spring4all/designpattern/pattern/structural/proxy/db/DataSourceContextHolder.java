package com.spring4all.designpattern.pattern.structural.proxy.db;

/**
 * @author qiankeqin
 * @Description: 数据库上下文容器
 * @date 2019-02-15 13:18
 */
public class DataSourceContextHolder {
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static void setDBType(String dbType){
        CONTEXT_HOLDER.set(dbType);
    }

    public static String getDBType(){
        return CONTEXT_HOLDER.get();
    }

    public static void clear(){
        CONTEXT_HOLDER.remove();
    }
}