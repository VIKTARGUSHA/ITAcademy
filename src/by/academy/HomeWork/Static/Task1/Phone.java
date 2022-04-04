package by.academy.HomeWork.Static.Task1;

//Реализовать подсчет количества созданных телефонов (класс Phone из прошлого урока) с помощью статической переменной.
//        Реализовать подсчет количества созданных телефонов (класс Phone из прошлого урока)
//        с помощью статической переменной.

public class Phone {
    private static int numberPhones;
    public Phone(){
        numberPhones++;
    }

    public static int getNumberPhones() {
        return numberPhones;
    }

    public void setNumberPhones(int numberPhones) {
        Phone.numberPhones = numberPhones;
    }
}
