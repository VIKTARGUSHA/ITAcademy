package by.academy.HomeWork.OOP.Task8;

public class Horse extends Animal{
    protected double age;
    protected String suit;
    public Horse(double age, String suit, String food, String location){
      super(food, location);
        this.age = age;
        this.suit = suit;
    }
    @Override
    public void makeNoise() {
        System.out.println("Cat says igogo");;
    }

    @Override
    public void eat() {
        System.out.println("Cat eats oats");
    }
}
