package by.academy.HomeWork.Interfaces.Task5;

import java.util.Arrays;

public enum ListCategories {
    Products{
        @Override
        void listGoodsCategories(){
            System.out.println("Milk, Bread, Meat, Tea");
        }
    }, Tabak, HauseHold{
        @Override
        void listGoodsCategories(){
            System.out.println("Paper, Magazine, Cup");
        }
    };
    void listOfCategories(){
        System.out.println(Arrays.toString(ListCategories.values()));
    }
    void listGoodsCategories(){
        System.out.println("Cigorets");
    }
}
