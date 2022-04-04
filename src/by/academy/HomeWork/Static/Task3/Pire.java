package by.academy.HomeWork.Static.Task3;

public class Pire extends Fruit{
    protected double price;

public Pire(double fruitPrice, double weight){
    super(weight);
    price = fruitPrice;
    totalPrice += weight * this.price;
}
    @Override
    public double getFruitPrice() {
        return price * weight;
    }
}
