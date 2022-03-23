package by.academy.HomeWork.Arrays;

public class ArraysTask14 {
    public static void main(String[] args) {
        int[][] array = new int[8][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = (int)(Math.random()*89+10);
                if (j < 4) {
                    System.out.print(array[i][j] + " ");
                }
                else System.out.print(array[i][j] + "\n");
            }
        }
    }
}