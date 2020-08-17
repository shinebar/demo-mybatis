package com.example.impl;

import com.example.UserService;
import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author 341039
 * @Date 2020/8/12 16:42
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List selectByName(String name) {
        return null;
    }

    @Override
    public int insert(User user) {
        return 0;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public User verify(User user) {
        return null;
    }

    @Override
    public List select() {
        return userMapper.select();
    }

}
