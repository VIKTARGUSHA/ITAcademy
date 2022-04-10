package by.academy.HomeWork.Loops;

//30. С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне от 1 до 99 включительно.
public class LoopsTask30 {
    public static void main(String[] args) {
        int x = 1;
        int total = 0;
        while (x < 100){
            total += x;
            x += 2;
        }
        System.out.println(total);
    }
}
