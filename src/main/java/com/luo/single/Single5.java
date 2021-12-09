package com.luo.single;

/**
 * @Author ANGEL
 * @Date 2021/11/16 19:36
 */
public class Single5 {

    //TODO  懒汉式（线程安全，同步代码块）

    //将构造器私有，防止外部new（外部无法new Single对象）。
    private Single5(){

    }

    //在类内创建对象
    private static Single5 single5;

    //对外提供一个公共的静态方法，创建对象.
    //加入了 synchronized 关键字，但是连线程安全问题都没有解决。
    public static Single5 getInstance(){
        if (single5==null){
            synchronized(Single5.class){
                single5 = new Single5();
            }
        }
        return single5;
    }

}
