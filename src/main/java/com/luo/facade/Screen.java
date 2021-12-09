package com.luo.facade;

/**
 * @Author ANGEL
 * @Date 2021/12/5 20:02
 */
public class Screen {
    private Screen(){};
    private static Screen screen=new Screen();
    public static  Screen getScreen(){
        return screen;
    }

    public void up(){
        System.out.println("屏幕升起");
    }
    public void down(){
        System.out.println("屏幕落下");
    }
    public void on(){
        System.out.println("屏幕打开");
    }
    public void off(){
        System.out.println("屏幕关闭");
    }
}
