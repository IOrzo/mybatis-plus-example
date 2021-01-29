package com.sixtofly.mybatisplusexample;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sixtofly.mybatisplusexample.entity.User;
import com.sixtofly.mybatisplusexample.mapper.UserMapper;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.sql.Wrapper;

/**
 * 查询测试
 * @author xie yuan bing
 * @date 2021-01-29 10:52
 * @description
 */
@SpringBootTest
public class UserMapperQueryTest {

    @Resource
    private UserMapper userMapper;

    /**
     * SQL:
     * FROM user WHERE deleted=0 AND (username = ? AND (nick_name = ? OR nick_name = ?))
     */
    @Test
    public void testNested() {
        LambdaQueryWrapper<User> query = Wrappers.lambdaQuery();
        query.eq(User::getUsername, "xx")
                .nested((q) -> q.eq(User::getNickName, "xx").or().eq(User::getNickName, "xy"));
        System.out.println(userMapper.selectList(query));
    }

    /**
     * 分页查询
     */
    @Test
    public void page() {
        Page<User> page = new Page(1, 2);
        Page<User> result = userMapper.selectPage(page, null);
        System.out.println(result);
    }

}
