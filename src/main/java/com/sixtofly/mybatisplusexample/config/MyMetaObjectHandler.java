package com.sixtofly.mybatisplusexample.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 自动填充字段
 *
 * @author xie yuan bing
 * @date 2021-01-29 11:09
 * @description
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {


    @Override
    public void insertFill(MetaObject metaObject) {
        if (metaObject.hasSetter("autoCreateTime")) {
            // 没有设置则填充默认值
            strictInsertFill(metaObject, "autoCreateTime", LocalDateTime.class, LocalDateTime.now());
        }

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        if (metaObject.hasSetter("autoUpdateTime")) {
            strictUpdateFill(metaObject, "autoUpdateTime", LocalDateTime.class, LocalDateTime.now());
        }
    }

}
