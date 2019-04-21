package cn.gjz.service;


import cn.gjz.entity.FoodDetail;
import cn.gjz.entity.FoodType;

import java.util.ArrayList;

public interface FoodDetailService {

    public ArrayList<FoodType> getFoodType(int shopid);

    public ArrayList<FoodDetail> getFoodDetail(int shopid);
}
