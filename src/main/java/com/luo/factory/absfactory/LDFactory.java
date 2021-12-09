package com.luo.factory.absfactory;

import com.luo.factory.factorymethod.*;

/**
 * @Author ANGEL
 * @Date 2021/11/22 21:40
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza creatPizza(String orderType) {
        Pizza pizza=null;
        if ("pepper".equals(orderType)){
            return new LDPepperPizza();
        }else if ("cheese".equals(orderType)){
            return new LDCheesePizza();
        }
        return pizza;
    }
}
