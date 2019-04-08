package cn.gjz.controller;

import cn.gjz.entity.User;
import cn.gjz.service.UserLoginService;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @auther GuJunzhou
 * @date 2019/3/21 9:48
 */

@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
@Path("userLoginService")
public class UserLoginController {

    private final Logger logger = Logger.getLogger(UserLoginService.class);

    @Autowired
    private UserLoginService userLoginService;

    @POST
    @Path("/userLogin")
    public Response userLogin(User in){

        System.out.println("I'm here!");

        System.out.println(in.toString());

        JSONObject jsonObject = new JSONObject();

        if (in!=null) {

            String username = in.getUsername();
            String password = in.getPassword();

            System.out.println(username);
            System.out.println(password);

            User newUser = userLoginService.checkLogin(username);

            if (in.getPassword().equals(newUser.getPassword())) {
                jsonObject.put("data",newUser.getId());
                jsonObject.put("msg","登陆成功");
                jsonObject.put("code",50000);
            }
            else{
                jsonObject.put("data",0);
                jsonObject.put("msg","登陆失败");
                jsonObject.put("code",50000);
            }
        }
        return Response.status(200).entity(jsonObject.toString()).build();
    }
}
