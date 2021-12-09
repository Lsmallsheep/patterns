package com.luo.flyweight;

import java.util.HashMap;

/**
 * @Author ANGEL
 * @Date 2021/12/6 19:57
 */
public class WebsiteFactory {

    private HashMap<String,ConcreteWebSite> pool=new HashMap<>();

    public WebSite getWebSiteFactory(String type){
        if (!pool.containsKey(type)) {
            ConcreteWebSite concreteWebSite = new ConcreteWebSite(type);
            pool.put(type,concreteWebSite);
        }
        return pool.get(type);
    }
    public int getWebsiteCount(){
        return pool.size();
    }
}
