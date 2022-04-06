package by.academy.HomeWork.OOP.Task7.com.company.details;

public class Engine {
    protected double power;
    protected String company;

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", company='" + company + '\'' +
                '}';
    }
}
