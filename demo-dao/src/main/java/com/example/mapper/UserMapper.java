package com.example.mapper;

import com.example.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("userMapper")
public interface UserMapper {
    List selectByName(String name);
    int insert(User user);
    void update(User user);
    void delete(Long id);
    User verify(User user);
    List select();
}
