package com.sixtofly.mybatisplusexample.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author xie yuan bing
 * @date 2021-01-28 10:20
 * @description
 */
@Data
public class BaseEntity {

    @TableId(value = "id", type = IdType.AUTO) // 实体类的主键名称和表中主键名称不一致
    private Long id;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

    private Boolean deleted;
}
