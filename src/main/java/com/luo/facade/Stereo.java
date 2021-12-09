package com.luo.facade;

/**
 * @Author ANGEL
 * @Date 2021/12/5 20:02
 */
public class Stereo {
    private Stereo(){};
    private static Stereo screen=new Stereo();
    public static  Stereo getStereo(){
        return screen;
    }

    public void on(){
        System.out.println("立体声打开");
    }
    public void off(){
        System.out.println("立体声关闭");
    }
}
