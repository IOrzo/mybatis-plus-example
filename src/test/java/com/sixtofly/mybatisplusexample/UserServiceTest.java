package com.sixtofly.mybatisplusexample;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.sixtofly.mybatisplusexample.entity.User;
import com.sixtofly.mybatisplusexample.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author xie yuan bing
 * @date 2021-01-28 15:27
 * @description
 */
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert(){
        User user = new User();
        user.setUsername(RandomUtil.randomString(6));
        user.setNickName(RandomUtil.randomString(6));
        userMapper.insert(user);
        System.out.println(user);
    }

    @Test
    public void lambda() {
        LambdaQueryWrapper<User> query = Wrappers.lambdaQuery();
        List<User> userList = userMapper.selectList(query);
        userList.forEach(System.out::println);
    }

    @Test
    public void logicDelete() {
        userMapper.deleteById(8);
    }
}
