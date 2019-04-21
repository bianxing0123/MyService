package cn.gjz.entity;

import java.io.Serializable;

public class FoodType implements Serializable {

    private int shopid;

    private String name;

    public int getshopid() {
        return shopid;
    }

    public void setshopid(int shopid) {
        this.shopid = shopid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
