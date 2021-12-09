package com.luo.builder.builder;

/**
 * @Author ANGEL
 * @Date 2021/11/28 14:50
 */
public class HomeDirector {

    // TODO 建造者中指挥者
    HomeBuilder homeBuilder=null;

    public HomeDirector(HomeBuilder homeBuilder) {
        this.homeBuilder = homeBuilder;
    }

    public void setHomeBuilder(HomeBuilder homeBuilder) {
        this.homeBuilder = homeBuilder;
    }

    public Home constructorHome(){
        homeBuilder.basic();
        homeBuilder.walls();
        homeBuilder.roofed();
        return homeBuilder.buildHome();
    }
}
