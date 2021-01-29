package com.sixtofly.mybatisplusexample.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * mybatis plus 常用注解使用
 * @author xie yuan bing
 * @date 2021-01-28 15:23
 * @description
 */
@TableName("user") // 实体类的类名和数据库表名不一致
public class AnnotationUserEntity {

    /**
     * 账户
     * 实体类中的成员名称和表中字段名称不一致
     */
    @TableField("username")
    private String username;

    /**
     * 虚拟字段
     * 不是数据库字段
     */
    @TableField(exist = false)
    private String virtual;
}
