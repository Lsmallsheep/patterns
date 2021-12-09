package com.luo.bridge;

/**
 * @Author ANGEL
 * @Date 2021/11/30 20:21
 */
public class XiaoMi implements Brand{
    @Override
    public void open() {
        System.out.println("XiaoMi类 打开手机");
    }

    @Override
    public void close() {
        System.out.println("XiaoMi类 打开手机");
    }

    @Override
    public void call() {
        System.out.println("XiaoMi类 打电话");
    }
}
