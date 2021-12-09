package com.luo.builder.builder;

import java.util.Calendar;

/**
 * @Author ANGEL
 * @Date 2021/11/28 14:57
 */
public class Test {

    public static void main(String[] args) {

        OrdinaryHome ordinaryHome = new OrdinaryHome();
        HighHome highHome = new HighHome();
        HomeDirector homeDirector = new HomeDirector(highHome);
        homeDirector.constructorHome();
        homeDirector.setHomeBuilder(ordinaryHome);
        homeDirector.constructorHome();
        Calendar calendar = Calendar.getInstance();
    }

}
