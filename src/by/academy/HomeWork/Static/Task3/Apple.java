package by.academy.HomeWork.Static.Task3;

public class Apple extends Fruit{
    protected double priceApple;
    public Apple(double fruitPrice, double weight){
        super(weight);
        priceApple = fruitPrice;
        totalPrice += weight * priceApple;
    }
    @Override
    public double getFruitPrice() {
        return priceApple * weight;
    }
}
