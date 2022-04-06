package by.academy.HomeWork.OOP.Task7.com.company.vihicles;

import by.academy.HomeWork.OOP.Task7.com.company.details.Engine;
import by.academy.HomeWork.OOP.Task7.com.company.proffesions.Driver;

public class Car {
   protected String marka;
   protected String classCar;
    protected double weight;
   protected Driver driver;
    protected Engine engine;
    public void start(){
        System.out.println("let's go");
    }
    public void stop(){
        System.out.println("Halt");
    }
    public void turnRight(){
        System.out.println("turn left");
    }
    public void turnLeft(){
        System.out.println("turn right");
    }
    public void printInfo(){
        System.out.println("Car marka: " + marka + "\n" +
                "Car class: " + classCar + "\n" +
                "Car weight: " + weight + "\n" +
                "Car driver: " + driver.toString() + "\n" +
                "Car engine: " + engine.toString() + "\n");
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", classCar='" + classCar + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
