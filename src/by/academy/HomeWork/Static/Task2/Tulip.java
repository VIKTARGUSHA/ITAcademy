package by.academy.HomeWork.Static.Task2;

public class Tulip extends Flower{
    private String color;

    public Tulip(String country, int shelfLife, double price, String color){
        super(country, shelfLife, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tulip{" +
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
