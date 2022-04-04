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
    public void multiply(double[][] firstMatrix, double[][] secondMatrix) {
        double [][] adArray = new double[quantityStrings][quantityColumns];
        for (int i = 0; i < quantityStrings; i++) {
            for (int y = 0; y < quantityColumns; y++) {
                double x = 0;
                for (int j = 0; j < quantityColumns; j++) {
                    x += firstMatrix[i][j] * secondMatrix[j][y];
                    if (j == quantityColumns - 1) {
                        adArray[i][j] = x;
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
