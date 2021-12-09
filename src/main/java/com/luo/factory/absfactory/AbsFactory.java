package com.luo.factory.absfactory;

import com.luo.factory.factorymethod.Pizza;

/**
 * @Author ANGEL
 * @Date 2021/11/22 21:39
 */
public interface AbsFactory {

    public Pizza creatPizza(String orderType);

}
