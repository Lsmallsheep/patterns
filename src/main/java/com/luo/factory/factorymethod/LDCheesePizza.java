package com.luo.factory.factorymethod;

/**
 * @Author ANGEL
 * @Date 2021/11/22 20:18
 */
public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦奶酪pizza");
        System.out.println("伦敦奶酪披萨准备原材料");
    }
}
