package com.luo.factory.factorymethod;

/**
 * @Author ANGEL
 * @Date 2021/11/22 20:24
 */
public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if ("pepper".equals(orderType)){
            return new BJPepperPizza();
        }else if ("cheese".equals(orderType)){
            return new BJCheesePizza();
        }
        return pizza;
    }
}
