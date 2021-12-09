package com.luo.proxy.dynamic;

/**
 * @Author ANGEL
 * @Date 2021/12/6 21:41
 */
public class Test {

    public static void main(String[] args) {

        TeacherDao teacherDao = new TeacherDao();

//        Object proxyInstance = new ProxyFactory(teacherDao).getProxyInstance();
//        System.out.println(proxyInstance.getClass());

        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
//        proxyFactory.invoke()

    }

}
