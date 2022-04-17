package by.academy.HomeWork.GenericsAndInerClasses.Task7;

import java.util.Arrays;

public class Task7 {
    public  <T> T[][]  createMatrix(T [][] t) {
        T[][] matrix = (T[][]) new Object[5][7];
    for (int i = 0; i < 5; i++){
        for (int j = 0; j < 7; j++){
            matrix[i][j] = t[i][j];
        }
    }
    return matrix;
    }
}
