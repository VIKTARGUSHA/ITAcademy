package by.academy.lesson4.HomeWork;

//12. Найти произведение двузначных нечетных чисел кратных 13.
public class ArrayTask12 {
    public static void main(String[] args) {
        int multiplyCount = 1;
        for (int i = 10; i < 100; i ++){
            if (i%13 == 0 && i%2 == 1){
                multiplyCount = multiplyCount*i;
            }
        }
        System.out.println(multiplyCount + " ");
    }
}
