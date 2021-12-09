package com.luo.single;

/**
 * @Author ANGEL
 * @Date 2021/11/16 19:36
 */
public class Single3 {

    //TODO  懒汉式（线程不安全）

    //将构造器私有，防止外部new（外部无法new Single对象）。
    private Single3(){

    }

    //在类内创建对象
    private static Single3 single3;

    //对外提供一个公共的静态方法，创建对象。
    public static Single3 getInstance(){
        if (single3==null){
             single3 = new Single3();
        }
        return single3;
    }

}
