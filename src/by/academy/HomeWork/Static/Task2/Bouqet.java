package by.academy.HomeWork.Static.Task2;

public class Bouqet {
    protected Flower[] bouqet;
    protected double totalPrice = 0;

    public Bouqet(Flower[] bouqet) {
        this.bouqet = bouqet;
    }

    public double getTotalPrice() {
        for (Flower flower : bouqet) {
            totalPrice += flower.price;
        }
        return totalPrice;
    }
}
