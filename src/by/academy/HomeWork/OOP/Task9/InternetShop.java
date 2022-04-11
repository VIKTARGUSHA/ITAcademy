package by.academy.HomeWork.OOP.Task9;

public class InternetShop {
    public static void main(String[] args) {
        Category category = new Category("Product");
        Category category1 = new Category("Sweety");
        Goods[] goods = new Goods[3];
        goods[0] = new Goods("Bread", 1, "10", category.name);
        goods[1] = new Goods("White bread", 2, "8", category1.name);
        goods[2] = new Goods("Cake", 3, "6", category1.name);
        User user = new User("Viktar", "SuperViktar", goods);
    }
}
