package by.academy.ClassWork.Lesson9.FruitShop;

public class Abricos extends Fruit{
    protected double priceForKg = 20;

    public Abricos(double weight) {
        super(weight);
    }

    @Override
    public double getFruitPrice() {
        return priceForKg * weight;
    }
}
