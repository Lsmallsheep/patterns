package com.luo.single;

/**
 * @Author ANGEL
 * @Date 2021/11/16 19:36
 */
public class Single2 {

    //TODO  饿汉式（静态代码块实现）

    //将构造器私有，防止外部new（外部无法new Single对象）。
    private Single2(){

    }

    //在类内创建对象
    private static Single2 single2;

    //静态代码块实例化对象
    static {
        single2=new Single2();
    }

    //对外提供一个公共的静态方法，创建对象。
    public static Single2 getInstance(){
        return single2;
    }

}
