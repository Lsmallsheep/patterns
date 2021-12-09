package com.luo.builder.builder;

/**
 * @Author ANGEL
 * @Date 2021/11/28 14:46
 */
public class HighHome extends HomeBuilder {

    // TODO 具体建造者
    @Override
    public void basic() {
        System.out.println("高楼建造地基");
    }

    @Override
    public void walls() {
        System.out.println("高楼建造围墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }



}
