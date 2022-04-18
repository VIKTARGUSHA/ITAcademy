package by.academy.HomeWork.GenericsAndInerClasses.Task3;

public class MainTask3 {
    public static void main(String[] args) {

        UserNested uN = new UserNested("Mike", "Nike");
        uN.createQuery();
        UserNested.Query q1 = new UserNested.Query();
        q1.printToLog();

      //  UserNested.Query q2 = uN.createQuery();
    }
}