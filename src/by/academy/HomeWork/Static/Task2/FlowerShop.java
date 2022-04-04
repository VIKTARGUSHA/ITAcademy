package by.academy.HomeWork.Static.Task2;

public class FlowerShop {
    public static void main(String[] args) {
        Flower[] bouqet1 = new Flower[3];
        bouqet1[0] = new Carnation("Rushka", 5, 5, "Red");
        bouqet1[1] = new Pion("Niderland", 3, 10, "White");
        bouqet1[2] = new Rose("Belarus", 15, 7, "Red");
        Bouqet bouqet = new Bouqet(bouqet1);
        System.out.println("First bouqet price: " + bouqet.getTotalPrice());

        Flower[] bouqet2 = new Flower[5];
        bouqet2[0] = new Rose("Belarus", 15, 7, "Red");
        bouqet2[1] = new Rose("Belarus", 15, 7, "Red");
        bouqet2[2] = new Rose("Belarus", 15, 7, "Red");
        bouqet2[3] = new Rose("Belarus", 15, 7, "Red");
        bouqet2[4] = new Rose("Belarus", 15, 7, "Red");
        Bouqet bouqetTwo = new Bouqet(bouqet2);
        System.out.println("Second bouqet price: " + bouqetTwo.getTotalPrice());

        Flower[] bouqet3 = new Flower[4];
        bouqet3[0] = new Tulip("Ukraine", 1, 9, "Red");
        bouqet3[1] = new Tulip("Ukraine", 1, 9, "Yellow");
        bouqet3[2] = new Rose("Belarus", 15, 7, "Red");
        bouqet3[3] = new Pion("Niderland", 3, 10, "White");
        Bouqet bouqetThree = new Bouqet(bouqet3);
        System.out.println("Third bouqet price: " + bouqetThree.getTotalPrice());

        System.out.println("General quantity of sell flowers: " + (Flower.getQuantity()-1) );
    }
}