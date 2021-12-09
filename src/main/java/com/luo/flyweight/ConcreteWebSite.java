package com.luo.flyweight;

/**
 * @Author ANGEL
 * @Date 2021/12/6 19:56
 */
public class ConcreteWebSite extends WebSite{

    private String type="";

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为"+type+"使用者为"+user.getName());
    }

    public ConcreteWebSite(String type) {
        this.type = type;
    }

}
