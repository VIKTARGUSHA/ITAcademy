package by.academy.HomeWork.Static.Task2;

public class Pion extends Flower{
    private String color;
    public Pion(String country, int shelfLife, double price, String color){
        super(country, shelfLife, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pion{" +
                "color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
