package by.academy.HomeWork.GenericsAndInerClasses.Task8;

import java.util.Arrays;

public class MainMinMax {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        Double[] array1 = new Double[5];
        String [] array2 = new String[5];
        Short [] array3 = new Short[5];
        int x = 0;
        double d = 0;
        String s = "s";
        Short sh = 1;
        for (int i = 0; i < 5; i++) {
            array[i] = ++x;
            array1[i] = ++d;
            array2[i] = s;
            array3[i] =sh++;
            s += s;
        }
MinMax minMax = new MinMax(array);
   MinMax minMax1 = new MinMax(array1);
   MinMax minMax2 = new MinMax(array2);
   MinMax minMax3 = new MinMax(array3);
        System.out.println(Arrays.toString(array) + "\n" + minMax.getMax(array) + " " +  minMax.getMin(array) + "\n" + Arrays.toString(array1) + "\n"
                +  minMax.getMax(array1) + " " +  minMax.getMin(array1) + "\n"
                + Arrays.toString(array2) + "\n" + minMax.getMax(array2) + " " +  minMax.getMin(array2) + "\n" + Arrays.toString(array3) + "\n" +
                minMax.getMax(array3) + " " +  minMax.getMin(array3) );
    }
}