package com.luo.single;

/**
 * @Author ANGEL
 * @Date 2021/11/16 19:36
 */
public class Single6 {

    //TODO  双重检查（DC）

    //将构造器私有，防止外部new（外部无法new Single对象）。
    private Single6(){

    }

    //在类内创建对象
    //加入了volatile保证变量的可见性
    private static volatile Single6 single6;

    //对外提供一个公共的静态方法，创建对象.
    //加入了 synchronized 关键字，但是连线程安全问题都没有解决。
    public static Single6 getInstance(){
        if (single6==null){
            synchronized(Single6.class){
                if (single6==null){
                    single6 = new Single6();
                }
            }
        }
        return single6;
    }

}
