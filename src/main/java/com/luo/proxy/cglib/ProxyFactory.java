package com.luo.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author ANGEL
 * @Date 2021/12/7 19:29
 */
public class ProxyFactory implements MethodInterceptor {

    private Object teacherDao;

    public ProxyFactory(Object teacherDao) {
        this.teacherDao = teacherDao;
    }

    public Object getProxyInstance(){

        Enhancer enhancer = new Enhancer();//创建工具函数
        enhancer.setSuperclass(teacherDao.getClass());//设置工具类的父类
        enhancer.setCallback(this);//设置回调函数
        return enhancer.create();//创建代理对象

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("cglib代理模式开始");
        Object invoke = method.invoke(teacherDao, objects);
        System.out.println("cglib代理结束");
        return invoke;
    }
}
