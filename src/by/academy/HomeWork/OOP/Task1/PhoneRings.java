package by.academy.HomeWork.OOP.Task1;

public class PhoneRings {
    public static void main(String[] args) {

        Phone phone = new Phone(12345, "Y9", 123);
        Phone phone1 = new Phone(54321, "Y6Pro", 321);
        Phone phone2 = new Phone(98765, "Model", 48);
        System.out.println(phone.toString() + "\n" + phone1.toString() + "\n" + phone2.toString());
        System.out.println(phone.recieveCall("Boss"));
        System.out.println(phone.recieveCall("Boss", 13579));
        System.out.println(phone.getNumber());
        System.out.println(phone1.recieveCall("Petr"));
        System.out.println(phone1.recieveCall("Boss", 33333));
        System.out.println(phone1.getNumber());
        System.out.println(phone2.recieveCall("Ivanov"));
        System.out.println(phone2.recieveCall("Boss", 48484848));
        System.out.println(phone2.getNumber());
        phone.sendMessage(12345, 123456, 668787,69696596);
        phone1.sendMessage(33383,393939,30030);
        phone2.sendMessage(334432,2232,322322323, 214_48_44);

    }
}