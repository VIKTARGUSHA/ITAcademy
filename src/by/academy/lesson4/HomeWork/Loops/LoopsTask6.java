package by.academy.lesson4.HomeWork.Loops;

//В сберкассу на трёхпроцентный вклад положили S рублей.Какой станет сумма вклада через N лет.
public class LoopsTask6 {
    public static void main(String[] args) {
        double s = 100;
        int yearCount = 5;
        for (int i = 0; i < yearCount; i++){
            s = s * 1.03;
        }
        System.out.println(s);
    }
}
