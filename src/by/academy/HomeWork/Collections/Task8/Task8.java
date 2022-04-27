package by.academy.HomeWork.Collections.Task8;

import by.academy.HomeWork.Collections.Task5.HeavyBox;

import java.util.TreeSet;

//Создать TreeSet содержащий HeavyBox. HeavyBox должен реализовать интерфейс Comparable.
// Распечатать содержимое с помощью for each. (по весу)
public class Task8 {
    public static void main(String[] args) {
        TreeSet<HeavyBox> treeSet = new TreeSet();
        HeavyBox heavyBox1 = new HeavyBox(100, 1);
        HeavyBox heavyBox2 = new HeavyBox(15, 2);
        HeavyBox heavyBox3 = new HeavyBox(20, 3);
        HeavyBox heavyBox4 = new HeavyBox(25, 5);
        HeavyBox heavyBox5 = new HeavyBox(5, 6);

        treeSet.add(heavyBox1);
        treeSet.add(heavyBox2);
        treeSet.add(heavyBox3);
        treeSet.add(heavyBox3);
        treeSet.add(heavyBox4);
        treeSet.add(heavyBox5);

        for (HeavyBox box : treeSet){
            System.out.println(box.toString());
        }
    }
}