package com.luo.single;

/**
 * @Author ANGEL
 * @Date 2021/11/16 19:36
 */
public class Single4 {

    //TODO  懒汉式（线程安全，同步方法）

    //将构造器私有，防止外部new（外部无法new Single对象）。
    private Single4(){

    }

    //在类内创建对象
    private static Single4 single4;

    //对外提供一个公共的静态方法，创建对象.
    //加入了 synchronized 关键字，解决了线程安全问题，
    public static synchronized Single4 getInstance(){
        if (single4==null){
            single4 = new Single4();
        }
        return single4;
    }

}
