package by.academy.lesson4.lesson;

public class lesson4S {
    public static void main(String[] args) {
        in : for (int i = 0; i < 10; i++){
            for (int j = 0; j < 50; j++){
                if (j*i == 56){
                    System.out.println( i + " " + j);
                    break in;
                }
            }
        }
    }
}
