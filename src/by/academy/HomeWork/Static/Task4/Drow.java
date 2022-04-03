package by.academy.HomeWork.Static.Task4;

public class Drow {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        System.out.println("First figure: L = " + circle.length() + " " +"S = "+ circle.square());
        Circle circle1 = new Circle(10);
        System.out.println("Second figure: L = " + circle1.length() + " " +"S = "+ circle1.square());
        Circle circle2 = new Circle(100);
        System.out.println("Third figure: L = " + circle2.length() + " " +"S = "+ circle2.square());
    }
}
