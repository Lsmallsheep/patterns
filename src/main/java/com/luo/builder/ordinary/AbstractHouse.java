package com.luo.builder.ordinary;

/**
 * @Author ANGEL
 * @Date 2021/11/28 13:38
 */
public abstract class AbstractHouse {

    //todo 传统方法下完成建房子
    //打地基
    public abstract void buildBasic();
    //砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void roofed();
    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }

}
