package com.luo.proxy.staticproxy;

/**
 * @Author ANGEL
 * @Date 2021/12/6 21:10
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teacher() {
        System.out.println("老师正在教书----");
    }
}
