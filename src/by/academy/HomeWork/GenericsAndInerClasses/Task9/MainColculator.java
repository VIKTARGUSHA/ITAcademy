package by.academy.HomeWork.GenericsAndInerClasses.Task9;

public class MainColculator {
    public static void main(String[] args) {
        Colculator colculator = new Colculator();
        Colculator.sum <Integer, String> (2,  "two");
        Colculator.subtraction(2.0 , 7.0f);
        Colculator.divide(2, 3.0);
        Colculator.multiply(6.0f, 5);
    }
}
