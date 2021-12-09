package com.luo.factory.prototype;/**
 *
 *@Author ANGEL
 *@Date 2021/11/23 21:40
 *
 */
public class Sheep implements Cloneable{

    private String name;
    private String year;
    private String color;

    public Sheep(String name, String year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //这里违反里氏替换原则-------------
    @Override
    protected Sheep clone()   {
        Sheep sheep=null;
        try {
         return  (Sheep) super.clone();
        }catch (Exception e){
            e.printStackTrace();
            return sheep;
        }
    }
}
