package com.sixtofly.mybatisplusexample.config;

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;

/**
 * Mapper自定义方法
 *
 * @author xie yuan bing
 * @date 2021-01-29 14:12
 * @description
 */
public class CustomizeMethod extends AbstractMethod {

    @Override
    public MappedStatement injectMappedStatement(Class<?> mapperClass, Class<?> modelClass, TableInfo tableInfo) {
        // 执行的sql
        String sql = "select * from " + tableInfo.getTableName();
        // mapper接口方法名
        String method = "findAll";
        SqlSource sqlSource = languageDriver.createSqlSource(configuration, sql, mapperClass);
        // 使用addXXXXStatement方法添加增删改查sql
        return addSelectMappedStatementForTable(mapperClass, method, sqlSource, tableInfo);
    }
}
