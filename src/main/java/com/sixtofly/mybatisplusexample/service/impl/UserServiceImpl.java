package com.sixtofly.mybatisplusexample.service.impl;

import com.sixtofly.mybatisplusexample.entity.User;
import com.sixtofly.mybatisplusexample.mapper.UserMapper;
import com.sixtofly.mybatisplusexample.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xieyuanbing
 * @since 2021-01-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
