package com.luo.proxy.staticproxy;

/**
 * @Author ANGEL
 * @Date 2021/12/6 21:15
 */
public class Test {

    public static void main(String[] args) {

        TeacherDao teacherDao = new TeacherDao();
        teacherDao.teacher();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teacher();

    }

}
