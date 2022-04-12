package by.academy.HomeWork.Interfaces.Task4;

public class Tresuares extends Clothes implements ClothesForMen, ClothesForWomen{


    public Tresuares(double wear, double price, String color){
                    super(wear, price, color);
                }

    @Override
    public void putOnMan(Clothes clothes) {
        System.out.println(clothes.wear + " " + clothes.price + " " + clothes.color + "\n");
    }
    @Override
    public void putOnWoman(Clothes clothes) {
        System.out.println(clothes.wear + " " + clothes.price + " " + clothes.color+ "\n");
    }

    @Override
    public void putOnWomen() {
        System.out.println(wear + " " + price + " " + color);
    }

    @Override
    public void putOnMen() {
        System.out.println(wear + " " + price + " " + color + "\n");
    }
}
