package by.academy.HomeWork.Interfaces.Task5;

import java.util.Scanner;

public class InternetShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        UserCheck[] userChecks = UserCheck.values();
        UserCheck userCheck = UserCheck.valueOf(userName);
    }
}
