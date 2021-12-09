package com.luo.facade;

/**
 * @Author ANGEL
 * @Date 2021/12/5 20:02
 */
public class DVDPlayer {
    private DVDPlayer(){};
    private static DVDPlayer screen=new DVDPlayer();
    public static DVDPlayer getDVDPlayer(){
        return screen;
    }

    public void pause(){
        System.out.println("DVD暂停");
    }
    public void play(){
        System.out.println("dvd开始播放");
    }
    public void on(){
        System.out.println("dvd打开");
    }
    public void off(){
        System.out.println("dvd关闭");
    }
}
