package com.sixtofly.mybatisplusexample.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.sixtofly.mybatisplusexample.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 自动填充测试
 * </p>
 *
 * @author xieyuanbing
 * @since 2021-01-29
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AutoFill extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 名称
     */
    private String name;

    /**
     * 自动填充创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime autoCreateTime;

    /**
     * 自动填充更新时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime autoUpdateTime;


}
