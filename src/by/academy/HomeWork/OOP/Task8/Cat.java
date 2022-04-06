package by.academy.HomeWork.OOP.Task8;

public class Cat extends Animal{
    protected String breed;
    protected int age;
    public Cat(String breed, int age, String food, String location){
        super(food, location);
        this.breed = breed;
        this.age = age;
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat says Miay");;
    }

    @Override
    public void eat() {
        System.out.println("Cat eats viskas");
    }
}
