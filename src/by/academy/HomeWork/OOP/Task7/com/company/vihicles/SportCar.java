package by.academy.HomeWork.OOP.Task7.com.company.vihicles;

import by.academy.HomeWork.OOP.Task7.com.company.proffesions.Driver;

public class SportCar extends Car{
    double maxSpeed;
    public SportCar(double maxSpeed, Driver d){
        this.maxSpeed = maxSpeed;
        driver = d;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
