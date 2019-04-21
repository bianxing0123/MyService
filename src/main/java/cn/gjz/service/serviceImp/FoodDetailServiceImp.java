package cn.gjz.service.serviceImp;

import cn.gjz.dao.FoodDetailDao;
import cn.gjz.entity.FoodDetail;
import cn.gjz.entity.FoodType;
import cn.gjz.service.FoodDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoodDetailServiceImp implements FoodDetailService {

    @Autowired
    private FoodDetailDao foodDetailDao;

    public ArrayList<FoodType> getFoodType(int shopid){
        return foodDetailDao.selectFoodType(shopid);
    }

    public ArrayList<FoodDetail> getFoodDetail(int shopid) {
        return foodDetailDao.selectFoodDetail(shopid);
    }
}
