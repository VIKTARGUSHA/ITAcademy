package by.academy.HomeWork.Deal;

import java.util.Arrays;

public class Deal {
    protected int time;
    protected User buyer;
    protected User saller;
    protected int numberOfProdukts;
    protected Boolean isDone;
    protected Product [] basket;

public Deal(int time, User buyer, User saller, Product[] basket, Boolean isDone, int numberOfProdukts){
    this.time = time;
    this.buyer = buyer;
    this.saller = saller;
    this.basket = basket;
    this.isDone = isDone;
}
public Deal(){

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

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }
}
