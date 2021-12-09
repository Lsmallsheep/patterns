package com.luo.adapter.classadapter;

/**
 * @Author ANGEL
 * @Date 2021/11/29 20:37
 */
public class Phone {

    public void charming(IVoltage iVoltage){
        if (iVoltage.outPut5V()==5){
            System.out.println("可以正常充电");
        }else {
            System.out.println("不可以正常充电");
        }
    }

}
