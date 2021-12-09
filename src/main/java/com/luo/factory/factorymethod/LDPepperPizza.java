package com.luo.factory.factorymethod;

/**
 * @Author ANGEL
 * @Date 2021/11/22 20:18
 */
public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦胡椒pizza");
        System.out.println("伦敦胡椒披萨准备原材料");
    }
}
