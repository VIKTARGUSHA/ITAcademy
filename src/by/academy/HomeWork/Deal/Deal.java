package by.academy.HomeWork.Deal;

import java.util.Arrays;

public class Deal {
    protected String time;
    protected User buyer;
    protected User saller;
    protected int numberOfProdukts;
    protected Boolean isDone;
    protected Product [] basket;
    protected double fullPrice;

public Deal(String time, User buyer, User saller, Product[] basket, Boolean isDone, int numberOfProdukts){
    this.time = time;
    this.buyer = buyer;
    this.saller = saller;
    this.basket = basket;
    this.isDone = isDone;
    this.numberOfProdukts = numberOfProdukts;
}
public Deal(){
}
public void deal(){
    if(basket == null){
        System.out.println("Error, the basket is empty");
        return;
    }

    for(Product product : basket){
        fullPrice += product.getColculatedPrice();
    }
}

    @Override
    public String toString() {
        return "Deal{" +
                "time=" + time +
                ", buyer=" + buyer +
                ", saller=" + saller +
                ", basket=" + Arrays.toString(basket) +
                ", isDone=" + isDone +
                '}';
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public Product[] getProducts() {
        return basket;
    }

    public void setProducts(Product[] products) {
        this.basket = products;
    }

    public User getSaller() {
        return saller;
    }

    public void setSaller(User saller) {
        this.saller = saller;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }
}
