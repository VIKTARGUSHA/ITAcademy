package by.academy.HomeWork.OOP.Task8;

public class Veterinar {
    public static void treatAnimal(Animal animal){
        System.out.println("Animal food: " + animal.getFood() + "\n" + "Animal location: " + animal.location + "\n");
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Dog(10, 5, "meet", "Minsk");
        animals[1] = new Cat("Pers", 11, "milk", "Pinsk");
        animals[2] = new Cat("Maincun", 2, "chese", "Grodno");
        animals[3] = new Horse(18, "black", "oats", "Ratomka" );
        animals[4] = new Horse(10, "White", "oats", "Poklady");
        animals[5] = new Dog(3, 1, "Purina", "Krichev");
        for(Animal animal : animals){
            Veterinar.treatAnimal(animal);
        }
    }
}
