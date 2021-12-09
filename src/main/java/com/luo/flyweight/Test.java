package com.luo.flyweight;

/**
 * @Author ANGEL
 * @Date 2021/12/6 20:07
 */
public class Test {

    public static void main(String[] args) {

        WebsiteFactory websiteFactory = new WebsiteFactory();
        WebSite webSite = websiteFactory.getWebSiteFactory("新闻");
        User user = new User();
        user.setName("小明");
        webSite.use(user);

    }

}
