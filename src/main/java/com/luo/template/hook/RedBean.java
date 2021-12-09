package com.luo.template.hook;

/**
 * @Author ANGEL
 * @Date 2021/12/7 21:06
 */

/**
 * TODO 钩子方法
 */
public class RedBean extends SoyMilk {
    @Override
    void addCondiments() {
        System.out.println("加入上好的配料-红豆");
    }
}
