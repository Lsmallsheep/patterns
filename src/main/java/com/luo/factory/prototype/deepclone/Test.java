package com.luo.factory.prototype.deepclone;

/**
 * @Author ANGEL
 * @Date 2021/11/24 21:30
 */
public class Test {

    public static void main(String[] args) {

        DeepProtype protype = new DeepProtype();
        protype.name="宋江";
        protype.deepCloneTarget=new DeepCloneTarget("大牛","小牛");

        DeepProtype p= (DeepProtype) protype.streamClone();
        System.out.println("name"+protype.name+"hashCode"+protype.hashCode());
        System.out.println("name"+p.name+"hashCode"+p.hashCode());

    }

}
