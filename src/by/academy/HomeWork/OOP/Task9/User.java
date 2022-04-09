package by.academy.HomeWork.OOP.Task9;

public class User {
    protected String name;
    protected String login;
    Goods [] goods;
    public User(){

    }
    public User(String name, String login, Goods [] goods){
        this.name = name;
        this.login = login;
        this.goods = goods;
    }
    Basket basket = new Basket(goods);
}
