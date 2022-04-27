package by.academy.HomeWork.Collections.Task7;

import by.academy.HomeWork.Collections.Task5.HeavyBox;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<HeavyBox> arrayList = new ArrayList<>();
        HeavyBox heavyBox1 = new HeavyBox(10, 1);
        HeavyBox heavyBox2 = new HeavyBox(15, 2);
        HeavyBox heavyBox3 = new HeavyBox(20,3);
        HeavyBox heavyBox4 = new HeavyBox(25,5);
        HeavyBox heavyBox5 = new HeavyBox(25, 6);
        arrayList.add(heavyBox1);
        arrayList.add(heavyBox2);
        arrayList.add(heavyBox3);
        arrayList.add(heavyBox3);
        arrayList.add(heavyBox4);
        arrayList.add(heavyBox5);
        for (HeavyBox box : arrayList){
            System.out.println(box.toString());
        }
        arrayList.get(0).setWeight(arrayList.get(0).getWeight()-1);
        System.out.println(arrayList.get(0).toString());

        arrayList.remove(arrayList.size()-1);
        for (HeavyBox box : arrayList){
            System.out.println(box.toString());
        }
        HeavyBox[] heavyBoxes = arrayList.toArray(HeavyBox[]::new);
        System.out.println( Arrays.toString(heavyBoxes));

        Object [] heavyBoxes1 = arrayList.toArray();
        System.out.println(Arrays.toString(heavyBoxes1));

        arrayList.clear();
        System.out.println(arrayList.size());
    }
}
