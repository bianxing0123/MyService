package cn.gjz.dao;

import cn.gjz.entity.User;

public interface UserDao {

    User findUserByUserName(String username);
}
