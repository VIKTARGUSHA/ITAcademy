package by.academy.HomeWork.OOP.Task2;

public class Person {
    protected String fullName;
    protected int age;
    public Person(){

    }
    public Person(String fullName, int age){

    }
    public void talk(Person p){
        System.out.println(p + " is talking");
    }
    public void move(Person p){
        System.out.println(p + " is moving");
    }

}
