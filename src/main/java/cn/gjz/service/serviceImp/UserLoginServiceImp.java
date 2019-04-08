package cn.gjz.service.serviceImp;

import cn.gjz.dao.UserDao;
import cn.gjz.entity.User;
import cn.gjz.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther GuJunzhou
 * @date 2019/3/21 9:52
 */
@Service
public class UserLoginServiceImp implements UserLoginService {

    @Autowired
    private UserDao userDao;

    public User checkLogin(String username){
        return userDao.findUserByUserName(username);
    }
}
