package by.academy.HomeWork.OOP.Task7.com.company.vihicles;

public class Lorry extends Car{
    public double cargo;
    public Lorry(double cargo){
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "cargo=" + cargo +
                '}';
    }
}
