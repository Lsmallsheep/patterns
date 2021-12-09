package com.luo.facade;

/**
 * @Author ANGEL
 * @Date 2021/12/5 20:02
 */
public class Popcorn {
    private Popcorn(){};
    private static Popcorn screen=new Popcorn();
    public static  Popcorn getPopcorn(){
        return screen;
    }

    public void working(){
        System.out.println("爆米花机工作");
    }

    public void on(){
        System.out.println("爆米花机打开");
    }
    public void off(){
        System.out.println("爆米花机关闭");
    }
}
