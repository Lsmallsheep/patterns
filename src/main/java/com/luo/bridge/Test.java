package com.luo.bridge;

/**
 * @Author ANGEL
 * @Date 2021/11/30 20:36
 */
public class Test {

    public static void main(String[] args) {

        FlodPhone flodPhone = new FlodPhone(new XiaoMi());
        flodPhone.open();
        flodPhone.close();
        flodPhone.call();

    }

}
