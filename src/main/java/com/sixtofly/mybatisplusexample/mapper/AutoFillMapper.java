package com.sixtofly.mybatisplusexample.mapper;

import com.sixtofly.mybatisplusexample.entity.AutoFill;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 自动填充测试 Mapper 接口
 * </p>
 *
 * @author xieyuanbing
 * @since 2021-01-29
 */
public interface AutoFillMapper extends BaseMapper<AutoFill> {

    /**
     * 自定义方法
     * @return
     */
    List<AutoFill> findAll();
}
