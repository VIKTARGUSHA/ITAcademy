package by.academy.HomeWork.GenericsAndInerClasses.Task9;

public class Colculator {
    public static <T, V> double sum (T x, V y){
return  Double.parseDouble(x.toString()) + Double.parseDouble(y.toString());
    }
    public static <T, V> Double multiply(T x, V y){
return Double.parseDouble(x.toString())  * Double.parseDouble(y.toString());
    }
    public static <T,V> Double divide(T x, V y){
return Double.parseDouble(x.toString())  / Double.parseDouble(y.toString());
    }
    public static <T,V> Double subtraction(T x, V y){
return Double.parseDouble(x.toString()) - Double.parseDouble(y.toString());
    }
}
