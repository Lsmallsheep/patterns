package com.luo.factory.absfactory;

import com.luo.factory.factorymethod.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author ANGEL
 * @Date 2021/11/22 21:46
 */
public class OrderPizza {

    AbsFactory absFactory;
    public OrderPizza (AbsFactory Factory){
        setFactory(Factory);
    }

    private void setFactory(AbsFactory  absFactory){
        Pizza pizza=null;
        String orderType="";
        this.absFactory=absFactory;
        while (true){
            orderType=getType();
            pizza=absFactory.creatPizza(orderType);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }

        }

    }
    public static String getType(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入pizza种类");
            return bufferedReader.readLine();
        }catch (Exception e){
            return "";
        }
    }
}
