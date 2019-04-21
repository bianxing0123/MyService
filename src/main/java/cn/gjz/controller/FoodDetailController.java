package cn.gjz.controller;

import cn.gjz.entity.FoodDetail;
import cn.gjz.entity.FoodType;
import cn.gjz.service.FoodDetailService;
import cn.gjz.service.ShopInfoService;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Produces({ MediaType.APPLICATION_JSON })

@Path("foodDetailService")
public class FoodDetailController {

    private final Logger logger = Logger.getLogger(ShopInfoService.class);

    @Autowired
    private FoodDetailService foodDetailService;

    @POST
    @Path("/foodType")
    public Response getFoodType(int request_shopid){

        System.out.println(String.valueOf(request_shopid));

        ArrayList<FoodType> foodTypeArrayList = new ArrayList<FoodType>();

        foodTypeArrayList = foodDetailService.getFoodType(request_shopid);

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("data",foodTypeArrayList);
        jsonObject.put("msg","获取成功");
        jsonObject.put("code",50000);

        return Response.status(200).entity(jsonObject.toString()).build();
    }

    @POST
    @Path("/foodDetail")
    public Response getFoodDetail(int request_shopid){

        System.out.println(String.valueOf(request_shopid));

        ArrayList<FoodDetail> foodDetailArrayList = new ArrayList<FoodDetail>();

        foodDetailArrayList = foodDetailService.getFoodDetail(request_shopid);

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("data",foodDetailArrayList);
        jsonObject.put("msg","获取成功");
        jsonObject.put("code",50000);

        return Response.status(200).entity(jsonObject.toString()).build();
    }
}
