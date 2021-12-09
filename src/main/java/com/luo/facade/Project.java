package com.luo.facade;

/**
 * @Author ANGEL
 * @Date 2021/12/5 20:02
 */
public class Project {
    private Project(){};
    private static Project screen=new Project();
    public static  Project getScreen(){
        return screen;
    }

    public void focus(){
        System.out.println("投影仪对焦");
    }

    public void on(){
        System.out.println("投影仪打开");
    }
    public void off(){
        System.out.println("投影仪关闭");
    }
}
