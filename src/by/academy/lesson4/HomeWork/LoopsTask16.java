package by.academy.lesson4.HomeWork;

//16. В бригаде, работающей на уборке сена, имеется N сенокосилок.
//        Первая сенокосилка работала m часов, а каждая следующая на 10 минут больше,
//        чем предыдущая.Сколько часов проработала вся бригада?
public class LoopsTask16 {
    public static void main(String[] args) {
        int n =4;
        double m = 3;
        double numberMinutes = 0;
        int addMin = 0;
        for (int i = 0; i < n; i++){
            numberMinutes += m*60+addMin;
            addMin+=10;
        }
        System.out.println(numberMinutes/60);
    }
}
