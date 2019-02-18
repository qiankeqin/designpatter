package com.spring4all.designpattern.pattern.structural.proxy.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author qiankeqin
 * @Description: 动态数据源
 * @date 2019-02-15 13:17
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    /**
     * 返回值表示当前的db
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDBType();
    }
}