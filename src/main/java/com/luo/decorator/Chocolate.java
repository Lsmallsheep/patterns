package com.luo.decorator;

/**
 * @Author ANGEL
 * @Date 2021/12/5 10:38
 */
public class Chocolate extends Decorate{
    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(3.0f);
    }
}
