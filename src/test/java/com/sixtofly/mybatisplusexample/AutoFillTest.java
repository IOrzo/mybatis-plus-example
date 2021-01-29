package com.sixtofly.mybatisplusexample;

import cn.hutool.core.util.RandomUtil;
import com.sixtofly.mybatisplusexample.entity.AutoFill;
import com.sixtofly.mybatisplusexample.mapper.AutoFillMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

/**
 * 测试自动填充
 * @author xie yuan bing
 * @date 2021-01-29 11:18
 * @description
 */
@SpringBootTest
public class AutoFillTest {

    @Autowired
    private AutoFillMapper autoFillMapper;


    /**
     * 插入自动填充
     */
    @Test
    public void insert() {
        AutoFill autoFill = new AutoFill();
        autoFill.setName(RandomUtil.randomString(6));
        autoFillMapper.insert(autoFill);
        System.out.println(autoFillMapper.selectById(autoFill.getId()));
    }

    /**
     * 更新自动填充
     */
    @Test
    public void update() {
        AutoFill autoFill = new AutoFill();
        autoFill.setName(RandomUtil.randomString(6));
        autoFillMapper.insert(autoFill);
        autoFill.setName(RandomUtil.randomString(6) + "update");
        autoFillMapper.updateById(autoFill);
        System.out.println(autoFillMapper.selectById(autoFill.getId()));
    }

    /**
     * 测试设置值不更新
     */
    @Test
    public void insertSet() {
        AutoFill autoFill = new AutoFill();
        autoFill.setAutoCreateTime(LocalDateTime.of(2020, 12, 12, 12, 12));
        autoFill.setAutoUpdateTime(LocalDateTime.of(2020, 12, 12, 12, 12));
        autoFillMapper.insert(autoFill);
        System.out.println(autoFillMapper.selectById(autoFill.getId()));
    }

    /**
     * 自定义Mapper方法
     */
    @Test
    public void customizeMapperMethod() {
        System.out.println(autoFillMapper.findAll());
    }
}
