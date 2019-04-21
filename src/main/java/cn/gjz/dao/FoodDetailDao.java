package cn.gjz.dao;

import cn.gjz.entity.FoodDetail;
import cn.gjz.entity.FoodType;

import java.util.ArrayList;

public interface FoodDetailDao {
    ArrayList<FoodType> selectFoodType(int shopid);

    ArrayList<FoodDetail> selectFoodDetail(int shopid);
}
