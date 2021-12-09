package com.luo.composite;

/**
 * @Author ANGEL
 * @Date 2021/12/5 15:04
 */
public abstract class OrganizationComponent {
    //todo 组合模式

    private String name;
    private String desc;

    protected void add(OrganizationComponent organizationComponent){
        throw  new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        throw  new UnsupportedOperationException("不允许操作");
    }

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    protected abstract void print();
}
