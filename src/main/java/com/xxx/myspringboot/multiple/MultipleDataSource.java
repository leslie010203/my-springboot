package com.xxx.myspringboot.multiple;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @ClassName MultipleDataSource
 * @Author hello
 * @Date 2018/12/23 16:21
 **/
public class MultipleDataSource extends AbstractRoutingDataSource {


    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDateSource();
    }
}
