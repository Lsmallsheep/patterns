package com.luo.bridge;

/**
 * @Author ANGEL
 * @Date 2021/11/30 20:31
 */
public class FlodPhone extends Phone {


    public FlodPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("FlodPhone类 打开手机");
    }


    public void close() {
        super.close();
        System.out.println("FlodPhone类 打开手机");
    }


    public void call() {
        super.call();
        System.out.println("FlodPhone类 打电话");
    }
}
