package com.luo.factory.prototype.deepclone;

import java.io.Serializable;

/**
 * @Author ANGEL
 * @Date 2021/11/24 20:39
 */
public class DeepCloneTarget  implements Cloneable, Serializable {

    private static final long serializableUid=1l;
    private String cloneName;
    private String cloneClass;

    public DeepCloneTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
