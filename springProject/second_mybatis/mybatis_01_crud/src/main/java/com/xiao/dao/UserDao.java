package com.xiao.dao;

import com.xiao.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    // 获取全部用户
    List<User> getUserList();

    // 根据id查询用户
    User getUserById(int id);

    // insert一个用户
    int addUser(User user);

    // update用户
    int updateUser(User user);

    // delete用户
    int deleteUser(int id);

    // 使用map添加用户
    int addUser2(Map<String, Object> map);

    // 模糊查询
    List<User> getUserLike(String value);
}
