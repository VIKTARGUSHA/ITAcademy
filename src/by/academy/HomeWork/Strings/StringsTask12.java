package by.academy.HomeWork.Strings;

//12. Написать программу, которая выводит числа от 1 до 25 в виде матрицы 5x5 слева направо и сверху вниз.
public class StringsTask12 {
    public static void main(String[] args) {
        int [][] array = new int[5][5];
        for (int i = 0; i < 5; i++){
            System.out.println();
            for (int j = 0; j < 5; j++){
                array[i][j] = (int) (Math.random()*24-1);
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
