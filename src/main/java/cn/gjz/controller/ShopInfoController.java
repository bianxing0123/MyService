package cn.gjz.controller;

import cn.gjz.entity.ShopInfo;
import cn.gjz.service.ShopInfoService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

//@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })

@Path("shopListService")
public class ShopInfoController {

    private final Logger logger = Logger.getLogger(ShopInfoService.class);

    @Autowired
    private ShopInfoService shopInfoService;

    @POST
    @Path("/shopList")
    public Response getShopList(){

        System.out.println("GetShopList!");

        ArrayList<ShopInfo> shopInfoList = new ArrayList<ShopInfo>();

        shopInfoList = shopInfoService.getShopList();

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("data",shopInfoList);
        jsonObject.put("msg","获取成功");
        jsonObject.put("code",50000);

        return Response.status(200).entity(jsonObject.toString()).build();
    }

}
