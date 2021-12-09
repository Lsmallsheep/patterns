package com.luo.composite;

/**
 * @Author ANGEL
 * @Date 2021/12/5 15:23
 */
public class Test {

    public static void main(String[] args) {

        OrganizationComponent university = new University("清华大学","顶级大学");
        OrganizationComponent college = new College("计算机学院","计算机学院");
        OrganizationComponent college1 = new College("信息学院","信息学院");
        college.add(new Department("计算机科学与技术","老牌专业"));
        college.add(new Department("编译原理","很难学"));
        college1.add(new Department("通信原理","通信原理很难学"));
        college1.add(new Department("TCP/IP","TCP/IP难学-.-"));
        university.add(college);
        university.add(college1);
        university.print();

    }

}
