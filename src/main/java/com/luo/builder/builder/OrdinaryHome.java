package com.luo.builder.builder;

/**
 * @Author ANGEL
 * @Date 2021/11/28 14:46
 */
public class OrdinaryHome extends HomeBuilder {

    //TODO 具体建造者
    @Override
    public void basic() {
        System.out.println("普通房子建造地基");
    }

    @Override
    public void walls() {
        System.out.println("普通房子建造围墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
