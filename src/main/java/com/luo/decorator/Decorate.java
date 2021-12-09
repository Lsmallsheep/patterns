package com.luo.decorator;

/**
 * @Author ANGEL
 * @Date 2021/12/5 10:32
 */
public class Decorate extends Drink {
    private Drink drink;

    public Decorate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice()+drink.cost();
    }

    @Override
    public String getDes() {
        return super.getDes()+"  "+super.getPrice()+drink.getDes();
    }
}
