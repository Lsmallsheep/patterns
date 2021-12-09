package com.luo.factory.factorymethod;

/**
 * @Author ANGEL
 * @Date 2021/11/22 20:18
 */
public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京胡椒pizza");
        System.out.println("北京胡椒披萨准备原材料");
    }
}
