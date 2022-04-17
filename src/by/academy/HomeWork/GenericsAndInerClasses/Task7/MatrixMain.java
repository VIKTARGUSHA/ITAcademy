package by.academy.HomeWork.GenericsAndInerClasses.Task7;

import java.util.Arrays;

public class MatrixMain {
    public static void main(String[] args) {
        Integer[][] array = new Integer [5][7];
        String[][] array1 = new String[5][7];
        Double [][] array2 = new Double [5][7];
        Character[][] array3 = new Character [5][7];
        String s = "H";
        double d = 1;
        int in = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                array[i][j] = (int) (Math.random() * 10);
                array1[i][j] = s;
                s += "e";
                array2[i][j] = d;
                d++;
                array3[i][j] = (char) in;
                in++;
            }
        }
        Task7 matrix = new Task7();
        System.out.println(Arrays.deepToString(matrix.createMatrix(array)));
        System.out.println(Arrays.deepToString(matrix.createMatrix(array1)));
        System.out.println(Arrays.deepToString(matrix.createMatrix(array2)));
        System.out.println(Arrays.deepToString(matrix.createMatrix(array3)));
    }
}
