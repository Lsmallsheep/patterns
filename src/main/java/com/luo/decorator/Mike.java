package com.luo.decorator;

/**
 * @Author ANGEL
 * @Date 2021/12/5 10:38
 */
public class Mike extends Decorate{
    public Mike(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
