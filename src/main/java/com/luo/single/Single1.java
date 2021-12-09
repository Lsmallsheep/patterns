package com.luo.single;

/**
 * @Author ANGEL
 * @Date 2021/11/16 19:36
 */
public class Single1 {

    //TODO  饿汉式（静态常量实现）

    //将构造器私有，防止外部new（外部无法new Single对象）。
    private Single1(){

    }

    //在类内创建对象实例
    private final static Single1 single1=new Single1();

    //对外提供一个公共的静态方法，创建对象。
    public static Single1 getInstance(){
        return single1;
    }

}
