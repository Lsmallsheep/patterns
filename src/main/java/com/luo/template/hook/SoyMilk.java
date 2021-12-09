package com.luo.template.hook;

/**
 * @Author ANGEL
 * @Date 2021/12/7 21:01
 */
public abstract class SoyMilk {

    public final void make(){
        select();
        if (isAddCondiments()){
            addCondiments();
        }
        soak();
        beat();
    }

    void select(){
        System.out.println("选择新鲜的黄豆");
    }

    abstract void addCondiments();

    void soak(){
        System.out.println("浸泡三小时");
    }
    void beat(){
        System.out.println("放入黄豆和配料进行打碎");
    }

    boolean isAddCondiments(){//默认加作料
        return true;
    }

}
