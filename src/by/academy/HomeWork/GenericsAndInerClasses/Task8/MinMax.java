package by.academy.HomeWork.GenericsAndInerClasses.Task8;

import java.util.Arrays;

public class MinMax <T> {
    T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T getMax(T[] array) {
        Arrays.sort(array);
   return array[array.length-1];
    }

    public T getMin(T[] array){
        Arrays.sort(array);
        return array[0];
    }
}
