package cn.gjz.service.serviceImp;

import cn.gjz.dao.ShopInfoDao;
import cn.gjz.entity.ShopInfo;
import cn.gjz.service.ShopInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ShopInfoServiceImp implements ShopInfoService {

    @Autowired
    private ShopInfoDao shopInfoDao;

    public ArrayList<ShopInfo> getShopList(){
        return shopInfoDao.selectShopInfo();
    }
}
