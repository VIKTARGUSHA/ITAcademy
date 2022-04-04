package by.academy.ClassWork.Lesson9.FruitShop;

public abstract class Fruit {
    protected double weight;

    public Fruit(double weight){
        this.weight = weight;
    }

    public final void manufactureInfo(){
        System.out.println("Made in Ukraine");
    }

    public abstract double getFruitPrice();

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
