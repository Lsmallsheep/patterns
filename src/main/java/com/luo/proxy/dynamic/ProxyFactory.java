package com.luo.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author ANGEL
 * @Date 2021/12/6 21:24
 */
public class ProxyFactory implements InvocationHandler {

    private Object teacherDao;

    public ProxyFactory(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }
    public Object getProxyInstance(){

        return Proxy.newProxyInstance(teacherDao.getClass().getClassLoader(), teacherDao.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object invoke = method.invoke(teacherDao, args);
                return invoke;
            }
        });
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理开始"+method.getName());
//        Object invoke = method.invoke(teacherDao, args)
        Object invoke = method.invoke(teacherDao.getClass(),args);
        System.out.println("代理结束"+method.getName());
        return invoke;
    }
}
