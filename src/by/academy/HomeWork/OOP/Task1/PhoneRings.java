package by.academy.HomeWork.OOP.Task1;

public class PhoneRings {
    public static void main(String[] args) {

        Phone phone = new Phone(12345, "Y9", 123);
        Phone phone1 = new Phone(54321, "Y6Pro", 321);
        Phone phone2 = new Phone(98765, "Model", 48);
        System.out.println(phone.toString() + "\n" + phone1.toString() + "\n" + phone2.toString());
    }
}