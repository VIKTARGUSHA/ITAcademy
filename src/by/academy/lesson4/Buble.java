package by.academy.lesson4;

import java.util.Arrays;

public class Buble {
    public static void main(String[] args) {
        int array[] = {1, 2, 5, 6, 7, 8, 9, 0};
//        System.out.println(Arrays.toString(array));
//        int temp = array[1];
//        array[1] = array[2];
//        array[2] = temp;
//        System.out.println(Arrays.toString(array));
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < (array.length - 1-j); i++) {
                if (array[i + 1] < array[i]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }
}