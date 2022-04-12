package by.academy.HomeWork.Interfaces.Task4;

public class Skirt extends Clothes implements ClothesForWomen{

    public Skirt(double wear, double price, String color){
        super(wear, price, color);
    }
    public Skirt(){

    }
    @Override
    public void putOnWoman(Clothes clothes) {
            System.out.println(clothes.wear + " " + clothes.price + " " + clothes.color + "\n");

    }

    @Override
    public void putOnWomen() {
        System.out.println(wear + " " + price + " " + color + "\n");
    }

    @Override
    public void putOnMen() {
    }
}
