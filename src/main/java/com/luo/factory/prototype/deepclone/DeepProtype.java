package com.luo.factory.prototype.deepclone;

import java.io.*;
//import java.io.O

/**
 * @Author ANGEL
 * @Date 2021/11/24 20:42
 */
public class DeepProtype implements Serializable,Cloneable {

    public String name;

    public DeepCloneTarget deepCloneTarget;

    public DeepProtype() {
        super();
    }

    //通过object的克隆方式实现深拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep=null;
        deep=super.clone();
        DeepProtype deepProtype=(DeepProtype)deep;
        deepProtype.deepCloneTarget=(DeepCloneTarget) deepCloneTarget.clone();
        return deepProtype;
    }

    //通过流实现深拷贝
    public Object streamClone(){
        ByteArrayOutputStream bos=null;
        ObjectOutputStream oos=null;
        ByteArrayInputStream bis=null;
        ObjectInputStream ois=null;
        try {
            //序列化
            bos=new ByteArrayOutputStream();
            oos=new ObjectOutputStream(bos);
            oos.writeObject(this);//this其实就是指的当前类
            //反序列化
            bis=new ByteArrayInputStream(bos.toByteArray());
            ois=new ObjectInputStream(bis);
            DeepProtype o = (DeepProtype)ois.readObject();
            return o;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
