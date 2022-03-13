package by.academy.lesson4;

public class ArraysTask1 {
    public static void main(String[] args) {
        int ar[] = new int[10];
        int x = 0;
        for (int i : ar){
            x = x + 2;
            System.out.print(x + " ");
        }
        x = 0;
        System.out.println();
        for (int i : ar){
            x = x + 2;
            System.out.println(x + " ");
        }
        }

}
