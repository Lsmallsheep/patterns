package com.luo.facade;

/**
 * @Author ANGEL
 * @Date 2021/12/5 20:20
 */
public class Test {

    public static void main(String[] args) {
        Center center = new Center();
        center.ready();
        center.play();
        center.pause();
        center.over();
    }

}
