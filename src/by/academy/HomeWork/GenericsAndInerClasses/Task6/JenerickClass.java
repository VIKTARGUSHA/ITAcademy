package by.academy.HomeWork.GenericsAndInerClasses.Task6;

import java.io.Serializable;

public class JenerickClass <T extends Comparable, V extends Animal & Serializable, K extends Number>  {
   private T objT;
   private V objV;
   private K objK;
    public JenerickClass(T t, V v, K k){
        objT = t;
        objV = v;
        objK = k;
    }

    public K getObjK() {
        return objK;
    }

    public V getObjV() {
        return objV;
    }

    public T getObjT() {
        return objT;
    }
    void getNames(JenerickClass jC){
        System.out.println(getObjT().getClass() + "\n" + getObjV().getClass() + "\n" + getObjK().getClass());
    }
}
