package by.academy.HomeWork.Interfaces.Task5;

import java.util.Arrays;

public enum ListGoods {
    Bread, Milk, Salt, Meat, Tea, Paper, Magazine, Cup, Cigorets;
    void showListOfGoods(){
        System.out.println(Arrays.toString(ListGoods.values()));
    }
    void addGoods(ListGoods [] listGoods, ListGoods lgd){
        if (listGoods != null){
            for(int i = 0; i < listGoods.length; i++){
                if(listGoods[i] == null){
                    listGoods[i] = lgd;
                    break;
                }
            }
        }
    }
    void buyGoods(ListGoods [] listBuyedGoods){
        if (listBuyedGoods != null){
            for(int i = 0; i < listBuyedGoods.length; i++){
                if(listBuyedGoods[i] == null){
                    System.out.println(listBuyedGoods[i] + "is buyed");
                }
            }
        }
    }
}
