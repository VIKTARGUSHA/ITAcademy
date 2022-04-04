package by.academy.HomeWork.Static.Task3;

public class Deal {
    public static void main(String[] args) {
        Fruit[] products = new Fruit[5];
        double generalPrice = 0;
        products[0] = new Abricos(23, 150);
        products[1] = new Abricos(23, 140);
        products[2] = new Pire(30, 250);
        products[3] = new Pire(23, 350);
        products[4] = new Apple(15, 180);
        System.out.println(Fruit.totalPrice);
        for (Fruit f : products){
            generalPrice += f.getFruitPrice();
        }
        System.out.println(generalPrice);
        }
    }

