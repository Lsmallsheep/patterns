package com.luo.adapter.classadapter;

/**
 * @Author ANGEL
 * @Date 2021/11/29 20:24
 */
public class Voltage {
    //被适配器
    public int outPut220V(){
        int src=220;
        System.out.println("输出"+src+"伏");
        return src;
    }
}
