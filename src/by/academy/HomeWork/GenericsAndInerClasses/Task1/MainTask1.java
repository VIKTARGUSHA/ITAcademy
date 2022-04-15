package by.academy.HomeWork.GenericsAndInerClasses.Task1;

import javax.management.Query;

public class MainTask1 {
    public static void main(String[] args) {
        User user = new User("Mike", "Nike");
        user.createQuery();
        User.Query user1 = user.new Query();
        user1.printToLog();
        User.Query user2 = new User("Ivan", "12345").new Query();
        user2.printToLog();
    }
}