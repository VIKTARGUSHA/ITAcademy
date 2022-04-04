package by.academy.HomeWork.Static.Task3;

public abstract class Fruit {
    protected double weight;
    public static double totalPrice;
    public Fruit (double weight){
        this.weight = weight;
    }
    public final void manafacturerInfo(){
        System.out.println("Made in Ukraine");
    }
    public abstract double getFruitPrice();
}
