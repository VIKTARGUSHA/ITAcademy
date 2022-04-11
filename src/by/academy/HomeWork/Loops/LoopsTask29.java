package by.academy.HomeWork.Loops;

//29. с помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100 включительно.
public class LoopsTask29 {
    public static void main(String[] args) {
int x = 0;
while (x < 100){
    System.out.print((x += 2 ) +  " ");
}
    }
}
