package by.academy.HomeWork.Static.Task3;

public class Abricos extends Fruit {
    protected double priceAbricos;
    public Abricos(double priceAbricos, double weightAbricos){
        super(weightAbricos);
        this.priceAbricos = priceAbricos;
        totalPrice += weight * this.priceAbricos;
    }

    @Override
    public double getFruitPrice() {
        return priceAbricos * weight;
    }
}
