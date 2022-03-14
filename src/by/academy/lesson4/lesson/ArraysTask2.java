package by.academy.lesson4.lesson;

public class ArraysTask2 {
    public static void main(String[] args) {
        int[] ar = new int[50];
        int i = 1;
        for (int in : ar){
          in = i;
            System.out.print(in+ " ");
            i+=2;
            }
     ;
        System.out.println();
        for (int in : ar){

//            System.out.println(in+ " ");
            i+=2;
        }

        }
    }

