package by.academy.HomeWork.Interfaces.Task5;

import java.util.Arrays;
import java.util.Scanner;

public class InternetShop {
    static boolean userForCheck(String login, String password) {
        for (UserCheck u : UserCheck.values()) {
            if (u.LOGIN.equals(login)) {
                if (u.PASSWORD.equals(password)) {
                    System.out.println("Enter is allowed");
                    return true;
                }
            }
        }
        System.out.println("Enter is forbidden");
        return false;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String login = scanner.next();
        String password = scanner.next();

     while (!userForCheck(login, password)){
         System.out.println("One more time please");
         login = scanner.next();
         password= scanner.next();
     }
        System.out.println("Welcome");
     scanner.close();
        System.out.println(Arrays.toString(ListCategories.values()));

     for (ListCategories listCategories : ListCategories.values()) {
         listCategories.listGoodsCategories();
     }
        System.out.println(Arrays.toString(ListGoods.values()));
     ListGoods[] listGoodsArray = new ListGoods[10];
ListGoods.Bread.addGoodsInTheBasket(listGoodsArray, ListGoods.Bread);
    }
}
