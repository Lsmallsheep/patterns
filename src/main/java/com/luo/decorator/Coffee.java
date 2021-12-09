package com.luo.decorator;

/**
 * @Author ANGEL
 * @Date 2021/12/5 10:27
 */
public class Coffee  extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
