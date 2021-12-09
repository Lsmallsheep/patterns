package com.luo.decorator;

/**
 * @Author ANGEL
 * @Date 2021/12/5 10:41
 */
public class Test {

    public static void main(String[] args) {

        Drink american = new American();
        System.out.println(american.getDes()+"   "+american.getPrice()+"   "+american.cost());
        american=new Mike(american);
        System.out.println("美式咖啡+牛奶"+american.getDes()+"   "+american.getPrice()+"   "+american.cost());
        american=new Chocolate(american);
        System.out.println("美式咖啡+牛奶+巧克力"+american.getDes()+"   "+american.getPrice()+"   "+american.cost());
    }

}
