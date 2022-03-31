package by.academy.HomeWork.Loops;

//24. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
public class LoopsTask24 {
    public static void main(String[] args) {
        double total = 1;
        double multiply = 1;
        for (int i = 2; i < 12; i++){
            total = total + i;
            multiply = multiply * total;
            System.out.println(multiply + " " + total);
        }
        System.out.println(multiply);
    }
}
