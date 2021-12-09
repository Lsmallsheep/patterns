package com.luo.decorator;

/**
 * @Author ANGEL
 * @Date 2021/12/5 10:25
 */
public abstract class Drink {

    //TODO  装饰者模式

    public String des;
    private float price=0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
