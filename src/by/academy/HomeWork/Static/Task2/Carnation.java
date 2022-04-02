package by.academy.HomeWork.Static.Task2;

public class Carnation extends Flower{
    private String color;
    public Carnation(String country, int shelfLife, double price, String color){
        super(country, shelfLife, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Carnation{" +
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
