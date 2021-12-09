package com.luo.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ANGEL
 * @Date 2021/12/5 15:09
 */
public class University extends OrganizationComponent{

    List<OrganizationComponent> organizationComponents=new ArrayList<OrganizationComponent>();

    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    protected void print() {
        System.out.println("----------------"+super.getName()+"----------------");
        for (OrganizationComponent organizationComponent :organizationComponents){
            organizationComponent.print();
        }
    }


}
