package by.academy.HomeWork.Collections.Task3;

import java.util.ArrayList;

public class MainIterator {
    public static void main(String[] args) {
        ArrayList<Object> ar = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            ar.add(Math.random()*100);
        }
        ArrayIterator arrayIterator = new ArrayIterator(ar);
        while (arrayIterator.hasNext()){
            System.out.println(arrayIterator.next());
        }
    }
}
