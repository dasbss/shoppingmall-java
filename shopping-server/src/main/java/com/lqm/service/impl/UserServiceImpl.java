package com.lqm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lqm.domain.Commodity;
import com.lqm.domain.User;
import com.lqm.service.UserService;
import com.lqm.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{


    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User selectByUsernameAndPassword(String username, String password) {
        return userMapper.selectByUsernameAndPassword(username,password);
    }

    @Override
    public List<User> getPageInfo(int pageIndex, int pageSize, QueryWrapper<User> queryWrapper) {
        Page<User> page=new Page<>(pageIndex,pageSize);
        Page<User> result=userMapper.selectPage(page,queryWrapper);
        return result.getRecords();
    }

    @Override
    public Integer InsertUser(User user) {
        return userMapper.addAll(user);
    }

    @Override
    public Integer deleteById(Integer id) {
        return userMapper.deleteById(id);
    }

    @Override
    public Integer updateAll(User user) {
        return userMapper.updateAll(user);
    }

    @Override
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> selectByUsername(String username) {
        return userMapper.selectByUsername(username);
    }

    @Override
    public List<User> selectByEmial(String emial) {
        return userMapper.selectByEmialUsers(emial);
    }
}




