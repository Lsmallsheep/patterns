package com.luo.adapter.classadapter;

/**
 * @Author ANGEL
 * @Date 2021/11/29 20:29
 */
public class VoltageAdapter extends Voltage implements IVoltage{
    @Override
    public int outPut5V() {
        int i = outPut220V();
        System.out.println("输出"+i/44+"伏");
        return i/44;
    }
}
