package by.academy.HomeWork.Deal;

public class Chocolate extends Product{

    private String flavor;
    private int weight;

    public Chocolate(){

    }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
