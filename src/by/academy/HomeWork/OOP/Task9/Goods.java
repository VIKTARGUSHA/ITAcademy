package by.academy.HomeWork.OOP.Task9;

public class Goods {
    protected String name;
    protected double price;
    protected String reiting;
    protected String categoryName;
    Category category = new Category(categoryName);
    Category category1 = new Category(categoryName );

    public Goods(String name, double price, String reiting, String categoryName){
        this.name = name;
        this.price = price;
        this.reiting = reiting;
    }
    public Goods(){
    }
    }
