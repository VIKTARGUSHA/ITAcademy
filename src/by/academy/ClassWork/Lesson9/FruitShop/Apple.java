package by.academy.ClassWork.Lesson9.FruitShop;

public class Apple extends Fruit {
double priceForkg = 10;

    public Apple(double weight) {
        super(weight);
    }

    @Override
    public double getFruitPrice() {
        return priceForkg * weight;
    }
}
