package com.example;

import com.example.entity.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author 341039
 * @Date 2020/8/12 16:41
 * @Version 1.0
 */
public interface UserService {
    List selectByName(String name);
    int insert(User user);
    void update(User user);
    void delete(Long id);
    User verify(User user);
    List select();
}
