package by.academy.HomeWork.OOP.Task3;

import java.util.Arrays;

public class Matrix {
    int quantityStrings;
    int quantityColumns;
    double array[][] = new double[quantityStrings][quantityColumns];
    public Matrix(int quantityStrings, int quantityColumns){
        this.quantityStrings = quantityStrings;
        this.quantityColumns = quantityColumns;
    }
    public double[][] createArray(){
        double [][] firstMatrix = new double[quantityStrings][quantityColumns];
        for (int i = 0; i < quantityStrings; i++){
            for (int j = 0; j < quantityColumns; j++){
                firstMatrix[i][j] = (int)(Math.random()*11);
            }
        }
        return firstMatrix;
    }

    public void addition(double[][] firstMatrix, double[][] secondMatrix) {
        double [][] adArray = new double[quantityStrings][quantityColumns];
        for (int i = 0; i < quantityStrings; i++) {
            for (int j = 0; j < quantityColumns; j++) {
                adArray [i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        array = adArray;
    }

    public void multiplyOneFigure(double[][] firstMatrix, double d) {
        double [][] adArray = new double[quantityStrings][quantityColumns];
        for (int i = 0; i < quantityStrings; i++) {
            for (int j = 0; j < quantityColumns; j++) {
                adArray [i][j] = firstMatrix[i][j]*d;
            }
        }
        array = adArray;
    }

    public void print(double[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print( matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public void multiply(double[][] firstMatrix, double[][] secondMatrix) {
        double [][] adArray = new double[firstMatrix.length][secondMatrix[0].length];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int y = 0; y < secondMatrix[0].length; y++) {
                double x = 0;
                for (int j = 0; j < firstMatrix[0].length; j++) {
                    x += firstMatrix[i][j] * secondMatrix[j][y];
                    if (j == firstMatrix[0].length - 1) {
                        adArray[i][y] = x;
                    }
                }
            }
        }
        array = adArray;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "quantityStrings=" + quantityStrings +
                ", quantityColumns=" + quantityColumns +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
