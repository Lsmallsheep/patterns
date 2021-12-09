package com.luo.builder.builder;

/**
 * @Author ANGEL
 * @Date 2021/11/28 14:40
 */
//    相当于将home类做成具体的接口或抽象类
public abstract class HomeBuilder {

    // TODO 抽象类的建造者
    // protected Home homee=null;//聚合关系
    protected Home home=new Home();//组合关系
    public abstract void basic();
    public abstract void walls();
    public abstract void roofed();

    public Home buildHome(){
        return home;
    }
}
