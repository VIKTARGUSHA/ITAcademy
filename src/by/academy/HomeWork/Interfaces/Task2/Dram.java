package by.academy.HomeWork.Interfaces.Task2;

public class Dram implements Tool {
protected double size;
public Dram(double s){
    s = this.size;
}
    @Override
    public void play() {
        System.out.println("The dram is beaten size " + size);
    }
}
