package by.academy.HomeWork.GenericsAndInerClasses.Task9;

public class Colculator {

    public static <T,V extends T> T sum (T x, V y){
return x + y;
    }
    public static < T, V> Double multiply(T x, V y){
return  Double.parseDouble(x.toString()) * Double.parseDouble(y.toString());
    }
    public static <T,V> Double divide(T x, V y){
return (Double) x / (Double) y;
    }
    public static <T,V> Double subtraction(T x, V y){
return (Double) x - (Double) y;
    }
}
