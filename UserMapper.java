package com.itheima.mapper;

import com.itheima.pojo.User;

import java.util.List;

/**
 * @author hhm
 * @version 1.0
 */
public interface UserMapper {
    List<User> findAll();
}
