package com.luo.composite;

/**
 * @Author ANGEL
 * @Date 2021/12/5 15:21
 */
public class Department extends OrganizationComponent{

    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void print() {
        System.out.println(getName()+"---------"+getDesc());
    }
}
