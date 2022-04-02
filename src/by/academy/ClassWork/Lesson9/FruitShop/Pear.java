package by.academy.ClassWork.Lesson9.FruitShop;

public class Pear extends Fruit{
    protected double priceForkg = 15;

    public Pear(double weight){
        super(weight);
    }
    @Override
    public double getFruitPrice() {
        return priceForkg * weight;
    }
}
