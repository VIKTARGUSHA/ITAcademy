package by.academy.HomeWork.OOP.Task7.com.company.proffesions;

public class Person extends Driver{
    int age;
    String fullName;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
