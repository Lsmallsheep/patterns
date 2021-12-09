package com.luo.factory.factorymethod;

/**
 * @Author ANGEL
 * @Date 2021/11/22 20:18
 */
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京奶酪pizza");
        System.out.println("北京奶酪披萨准备原材料");
    }
}
