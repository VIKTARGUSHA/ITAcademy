package by.academy.HomeWork.OOP.Task9;

public class InternetShop {
    public static void main(String[] args) {

        Goods[] goods = new Goods[3];
        goods[0] = new Goods("Bread", 1, "10", "Product");
        goods[1] = new Goods("White bread", 2, "8", "Product");
        goods[2] = new Goods("Cake", 3, "6", "Sweety");
        User user = new User("Viktar", "SuperViktar", goods);
    }
}
