package com.luo.template.hook;

/**
 * @Author ANGEL
 * @Date 2021/12/7 21:06
 */
public class Walnut extends SoyMilk {
    @Override
    void addCondiments() {
        System.out.println("加入上好的配料-核桃");
    }

    @Override
    boolean isAddCondiments() {
        return true;
    }
}
