package com.luo.test;

import com.luo.single.Single1;
import com.luo.single.Single6;
import com.luo.single.Single7;
import com.luo.single.Single8;

import java.lang.reflect.Constructor;

/**
 * @Author ANGEL
 * @Date 2021/11/16 19:47
 */
public class TestSingle {

    public static void main(String[] args) throws Exception {
//        new Single  无法new Single对象
//        Single8 instance = Single8.INSTANCE;
//        Single8 instance1 = Single8.INSTANCE;
//        System.out.println(instance.hashCode());
//        System.out.println(instance1.hashCode());
//        instance.say();
//        Runtime runtime = Runtime.getRuntime();
        Single6 single6=Single6.getInstance();
        //反射破坏
        Class<?> aClass = Class.forName("com.luo.single.Single6");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();//得到默认构造器
        declaredConstructor.setAccessible(true);//跳过java语法检查
        Single6 o = (Single6)declaredConstructor.newInstance();//获得Single6实例并强转成Single6类型
        System.out.println(single6.hashCode());
        System.out.println(o.hashCode());

        Integer integer = Integer.valueOf(127);


    }

}
