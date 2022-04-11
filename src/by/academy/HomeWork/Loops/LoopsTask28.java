package by.academy.HomeWork.Loops;

//28. Бизнессмен взял ссуду m тысяч рублей в банке под 20% годовых.
// через сколько лет его долг превысит s тысяч рублей, если за это время он не будет отдавать долг.
public class LoopsTask28 {
    public static void main(String[] args) {
        double m = 100;
        double percent = m * 0.2;
        double s = 5000;
int counter = 0;
        while (m < s) {
            m *= 1.2;
            counter++;
        }
        System.out.println(counter);
    }
}