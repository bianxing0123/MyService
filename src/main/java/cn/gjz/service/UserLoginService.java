package cn.gjz.service;

import cn.gjz.dao.UserDao;
import cn.gjz.entity.User;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther GuJunzhou
 * @date 2019/3/7 10:36
 */


public interface UserLoginService {

    public User checkLogin(String username);

}