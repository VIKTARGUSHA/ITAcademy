package by.academy.HomeWork.Static.Task2;

//Создать класс Flower, который содержит переменные страна производитель, срок хранения в днях, цена.
//        Создать классы расширяющие класс Flower (для примера, пусть это будут розы, гвоздики, тюльпаны и...
//        что-то на свой вкус).  Собрать 3 букета (используем массив) с определением их стоимости.
//        В букет может входить несколько цветов разного типа. Также подсчитать количество проданных цветов
//        (используем статическую переменную). 

public class Flower {
    protected String countryMadeIn;
    protected int shelfLife;
    protected double price;
    public static int quantity;
    public Flower(String countryMadeIn, int shelfLife, double price){
        this.countryMadeIn = countryMadeIn;
        this.shelfLife = shelfLife;
        this.price = price;
        quantity++;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "countryMadeIn='" + countryMadeIn + '\'' +
                ", shelfLife=" + shelfLife +
                ", price=" + price +
                '}';
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
        Flower.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getCountryMadeIn() {
        return countryMadeIn;
    }

    public void setCountryMadeIn(String countryMadeIn) {
        this.countryMadeIn = countryMadeIn;
    }
}
