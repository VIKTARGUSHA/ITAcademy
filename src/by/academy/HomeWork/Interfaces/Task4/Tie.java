package by.academy.HomeWork.Interfaces.Task4;

public class Tie extends Clothes implements ClothesForMen{
    public Tie(double wear, double price, String color){
        super(wear, price, color);
    }
    @Override
    public void putOnWomen() {
    }
    @Override
    public void putOnMan(Clothes clothes) {
        System.out.println(clothes.wear + " " + clothes.price + " " + clothes.color + "\n");
    }
    @Override
    public void putOnMen() {
        System.out.println(wear + " " + price + " " + color);
    }
}
