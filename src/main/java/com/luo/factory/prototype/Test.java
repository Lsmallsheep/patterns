package com.luo.factory.prototype;

/**
 * @Author ANGEL
 * @Date 2021/11/23 21:50
 */
public class Test {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom","1","blue");
        Sheep clone1 = sheep.clone();
        System.out.println(sheep.hashCode());
        System.out.println(clone1.hashCode());
        System.out.println(sheep == clone1);
        System.out.println(sheep.equals(clone1));
    }
}
