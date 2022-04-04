package by.academy.HomeWork.OOP.Task1;

import java.util.Objects;

public class Phone implements java.io.Serializable {
    protected int number;
    protected String model;
    protected double weight;
    public Phone(int number, String model, double weight){
        this.weight = weight;
        this.model = model;
        this.number = number;
        new Phone(number, model);
    }
    public Phone(int number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){
    }

    public void sendMessage(int ... x){
        for (int i = 0; i < x.length; i++){
            System.out.print(" " + x[i]);
        }
        System.out.println();
    }

    public String recieveCall(String name){
        return "Звонит " + name;
    }

public String recieveCall(String name, int number){
        return name + " " + number;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return number == phone.number && Double.compare(phone.weight, weight) == 0 && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, model, weight);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
