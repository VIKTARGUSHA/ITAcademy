package by.academy.HomeWork.Collections.Task5;

import java.util.TreeSet;

public class MainTask5 {
    public static void main(String[] args) {
        TreeSet<HeavyBox> treeSet = new TreeSet<>();
        treeSet.add(new HeavyBox(5, 1));
        treeSet.add(new HeavyBox(10, 2));
        treeSet.add(new HeavyBox(15,3));
        treeSet.add(new HeavyBox(20,4));
        treeSet.add(new HeavyBox(25,5));
        treeSet.add(new HeavyBox(15, 6));
        for (HeavyBox h : treeSet){
            System.out.println(h);
        }
    }
}
