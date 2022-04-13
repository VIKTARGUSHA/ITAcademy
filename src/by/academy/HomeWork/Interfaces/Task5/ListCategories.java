package by.academy.HomeWork.Interfaces.Task5;

import java.util.Arrays;

public enum ListCategories {
    Products{
        @Override
        void listGoodsCategories(){
            System.out.println("Products: Milk, Bread, Meat, Tea");
        }
    }, Tabak, HauseHold{
        @Override
        void listGoodsCategories(){
            System.out.println("HouseHold: Paper, Magazine, Cup");
        }
    };
    void listOfCategories(){
        System.out.println(Arrays.toString(ListCategories.values()));
    }
    void listGoodsCategories(){
        System.out.println("Tabak: Cigorets");
    }
}
