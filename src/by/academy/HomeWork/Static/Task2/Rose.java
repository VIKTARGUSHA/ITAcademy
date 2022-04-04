package by.academy.HomeWork.Static.Task2;

public class Rose extends Flower{
    private String color;
    public Rose(String country, int shelfLife, double price, String color){
        super(country, shelfLife, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "color='" + color + '\'' +
                '}';
    }

}
