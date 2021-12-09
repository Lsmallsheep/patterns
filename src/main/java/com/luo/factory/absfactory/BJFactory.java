package com.luo.factory.absfactory;

import com.luo.factory.factorymethod.BJCheesePizza;
import com.luo.factory.factorymethod.BJPepperPizza;
import com.luo.factory.factorymethod.Pizza;

/**
 * @Author ANGEL
 * @Date 2021/11/22 21:40
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza creatPizza(String orderType) {
        Pizza pizza=null;
        if ("pepper".equals(orderType)){
            BJPepperPizza bjPepperPizza = new BJPepperPizza();
            bjPepperPizza.setName("hujiao");
            return bjPepperPizza;
        }else if ("cheese".equals(orderType)){
            BJCheesePizza bjCheesePizza = new BJCheesePizza();
            bjCheesePizza.setName("naixi");
            return bjCheesePizza;
        }
        return pizza;
    }
}
