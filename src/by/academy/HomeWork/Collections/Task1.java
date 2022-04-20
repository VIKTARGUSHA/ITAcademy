package by.academy.HomeWork.Collections;

import java.util.ArrayList;
import java.util.Objects;
import java.util.TreeSet;

public class Task1 {
    int special;
    public Task1(int i){
        special = i;
    }
    public static ArrayList <Task1> returnListWithoutDublicates(ArrayList<Task1> ar){
        TreeSet<Task1> tree = new TreeSet<>();
        ArrayList<Task1> ar1 = new ArrayList<>();

        for (int i = 0; i < ar.size(); i++ ){
            tree.add(ar.get(i));
        }
        Task1 [] array = (Task1[]) tree.toArray();
        for (int j = 0; j < array.length; j++){
            ar1.add(array[j]);
        }
        return ar1;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task1 task1 = (Task1) o;
        return special == task1.special;
    }

    @Override
    public int hashCode() {
        return Objects.hash(special);
    }

    @Override
    public String toString() {
        return "Task1{" +
                "special=" + special +
                '}';
    }
}
