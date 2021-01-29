package com.sixtofly.mybatisplusexample.config;

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 注入Mapper自定义方法
 * @author xie yuan bing
 * @date 2021-01-29 14:17
 * @description
 */
@Component
public class CustomizeSqlInjector extends DefaultSqlInjector {

    @Override
    public List<AbstractMethod> getMethodList(Class<?> mapperClass) {
        List<AbstractMethod> methodList = super.getMethodList(mapperClass);
        methodList.add(new CustomizeMethod());
        return methodList;

    }
}
