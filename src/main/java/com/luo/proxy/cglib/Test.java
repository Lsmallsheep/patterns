package com.luo.proxy.cglib;

/**
 * @Author ANGEL
 * @Date 2021/12/7 19:46
 */
public class Test {

    public static void main(String[] args) {

        TeacherDao teacherDao = new TeacherDao();
        TeacherDao proxyFactory = (TeacherDao)new ProxyFactory(teacherDao).getProxyInstance();
        int test = proxyFactory.test();
        System.out.println(test);

    }

}
