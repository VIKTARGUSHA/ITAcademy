package by.academy.HomeWork.GenericsAndInerClasses.Task9;

public class MainColculator {
    public static void main(String[] args) {
        Colculator colculator = new Colculator();
        System.out.println(Colculator. <Integer, Double> sum(1,  3.0));
        System.out.println(Colculator.<Double, Float> subtraction(2.0 , 7.0f));
        System.out.println(Colculator.<Double, Integer>divide(2.0, 7));
        System.out.println(Colculator.<Float, Long>multiply(6.0f, 5L));
        System.out.println(Colculator.<String, Double>sum("2.0", 5.5 ));
        System.out.println(Colculator.<Float, Short> multiply(9.9f, (short) 6));
    }
}
