package by.academy.HomeWork.GenericsAndInerClasses.Task9;

public class MainColculator {
    public static void main(String[] args) {
        Colculator colculator = new Colculator();
        Colculator.<Integer, String>sum (2,  "two");
        Colculator.<Double, Float>subtraction(2.0 , 7.0f);
        Colculator.<Integer, Double>divide(2, 3.0);
        Colculator.<Float, Integer>multiply(6.0f, 5);
    }
}
