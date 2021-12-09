package com.luo.builder.ordinary;

/**
 * @Author ANGEL
 * @Date 2021/11/28 13:43
 */
public class Ordinary extends AbstractHouse {

    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }


}
