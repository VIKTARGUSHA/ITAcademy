package by.academy.HomeWork.OOP.Task8;

public class Dog extends Animal{
    protected double weight;
    protected int age;
    public Dog(double weight, int age, String food, String location){
        super(food, location);
        this.weight = weight;
        this.age = age;
    }
    @Override
    public void makeNoise() {
        System.out.println("Cat says gav gav");;
    }

    @Override
    public void eat() {
        System.out.println("Cat eats Pedigree");
    }
}
