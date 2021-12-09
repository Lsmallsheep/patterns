package com.luo.bridge;

/**
 * @Author ANGEL
 * @Date 2021/11/30 20:21
 */
public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("Vivo类 打开手机");
    }

    @Override
    public void close() {
        System.out.println("Vivo类 关闭手机");
    }

    @Override
    public void call() {
        System.out.println("Vivo类 打电话");
    }

}
