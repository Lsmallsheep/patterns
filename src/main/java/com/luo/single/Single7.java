package com.luo.single;

/**
 * @Author ANGEL
 * @Date 2021/11/16 19:36
 */
public class Single7 {

    //TODO  静态内部类

    //将构造器私有，防止外部new（外部无法new Single对象）。
    private Single7(){

    }

    //创建静态内部类
    private static class Single7Instance{
        private static final Single7 SINGLE7=new Single7();
    }

    //对外提供一个公共的静态方法，创建对象.
    public static Single7 getInstance(){
        return Single7Instance.SINGLE7;
    }

}
