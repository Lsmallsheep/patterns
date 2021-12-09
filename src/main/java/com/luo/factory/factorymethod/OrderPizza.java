package com.luo.factory.factorymethod;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;

/**
 * @Author ANGEL
 * @Date 2021/11/22 20:26
 */
public abstract class OrderPizza {

    abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza=null;
        String orderType;
        while (true){
            orderType=getType();
            pizza=createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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
