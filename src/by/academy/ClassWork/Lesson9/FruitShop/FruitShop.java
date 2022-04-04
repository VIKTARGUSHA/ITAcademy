package by.academy.ClassWork.Lesson9.FruitShop;

public class FruitShop {
    public static void main(String[] args) {
        Fruit [] fruits = new Fruit[4];
                double totalPrice = 0;
        Apple apple = new Apple(3.0);
        Apple apple1 = new Apple(1.5);
        Pear pear = new Pear(2.0);
        Abricos abricos = new Abricos(1.0);
        fruits[0] = apple;
        fruits[1] = apple1;
        fruits[2] = pear;
        fruits[3] = abricos;
        for(Fruit f : fruits){
            totalPrice += f.getFruitPrice();
        }
        System.out.println(totalPrice);
    }
}
