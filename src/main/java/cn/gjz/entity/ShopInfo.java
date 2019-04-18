package cn.gjz.entity;

public class ShopInfo {

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public int getShopsellamount() {
        return shopsellamount;
    }

    public void setShopsellamount(int shopsellamount) {
        this.shopsellamount = shopsellamount;
    }


    public int getDelivercost() {
        return delivercost;
    }

    public void setDelivercost(int delivercost) {
        this.delivercost = delivercost;
    }

    public int getShopinfoid() {
        return shopinfoid;
    }

    public void setShopinfoid(int shopinfoid) {
        this.shopinfoid = shopinfoid;
    }

    public int getStartsendprice() {
        return startsendprice;
    }

    public void setStartsendprice(int startsendprice) {
        this.startsendprice = startsendprice;
    }

    @Override
    public String toString() {
        return "ShopInfo{" +
                "shopinfoid=" + shopinfoid +
                ", shopname='" + shopname + '\'' +
                ", shopsellamount=" + shopsellamount +
                ", startsendprice=" + startsendprice +
                ", delivercost=" + delivercost +
                '}';
    }

    private int shopinfoid;

    private String shopname;

    private int shopsellamount;

    private int startsendprice;

    private int delivercost;



}
