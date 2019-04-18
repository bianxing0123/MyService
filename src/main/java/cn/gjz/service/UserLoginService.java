package cn.gjz.service;

import cn.gjz.entity.User;

/**
 * @auther GuJunzhou
 * @date 2019/3/7 10:36
 */


public interface UserLoginService {

    public User checkLogin(String username);

}