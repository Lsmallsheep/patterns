package com.luo.proxy.staticproxy;

/**
 * @Author ANGEL
 * @Date 2021/12/6 21:10
 */
public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao teacherDao;

    public TeacherDaoProxy(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teacher() {
        System.out.println("代理开始");
        teacherDao.teacher();
        System.out.println("代理结束");
    }
}
