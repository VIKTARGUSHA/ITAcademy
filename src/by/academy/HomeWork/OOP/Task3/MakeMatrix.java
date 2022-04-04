package by.academy.HomeWork.OOP.Task3;

import java.util.Arrays;

public class MakeMatrix {
    public static void main(String[] args) {

        Matrix matrix = new Matrix(3, 3);

       double [][] matrica1 = matrix.createArray();
        System.out.println(Arrays.deepToString(matrica1));
//        double [][] matrica2 = matrix.createArray();
//        System.out.println(Arrays.deepToString(matrica2));
        //System.out.println(Arrays.deepToString(secondMatrix));
//        matrix.addition(matrica1, matrica2);
//        System.out.println(Arrays.deepToString(matrix.array));
        Matrix matrix1 = new Matrix(3, 3);
        double [][]matrica3 = matrix1.createArray();
        System.out.println(Arrays.deepToString(matrica3));
//        double[][] matrica = matrix.createArray();
//        System.out.println(Arrays.deepToString(matrica));
//        matrix.multiplyOneFigure(matrica, 4);
//        System.out.println(Arrays.deepToString(matrix.array));
        matrix.multiply(matrica1, matrica3 );
        System.out.println(Arrays.deepToString(matrix.array));
    }
}
