package by.academy.HomeWork.Interfaces.Task4;

public abstract class Clothes {
    double wear;
    double price;
    String color;
    public Clothes(double wear, double price, String color){
        this.wear = wear;
        this.price = price;
        this.color = color;
    }
    public Clothes(){
    }
    public abstract void putOnWomen();
    public abstract void putOnMen();
}
