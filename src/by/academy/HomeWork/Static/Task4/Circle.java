package by.academy.HomeWork.Static.Task4;

public class Circle {
    protected double radius;
    public final static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }
   public double square(){
       return PI * radius * radius;

   }
   public double length(){
        return 2 * PI * radius;
   }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
