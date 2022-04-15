package by.academy.HomeWork.Interfaces.Task5;

import java.util.Arrays;

public enum ListGoods {
    Bread, Milk, Salt, Meat, Tea, Paper, Magazine, Cup, Cigorets;
    void showListOfGoods(){
        System.out.println(Arrays.toString(ListGoods.values()));
    }
    void addGoodsInTheBasket(ListGoods [] listGoods, String lgd){
        if (listGoods != null){
            for(int i = 0; i < listGoods.length; i++){
                if(listGoods[i] == null){
                    listGoods[i] = valueOf(lgd);
                    break;
                }
            }
        }
    }
    void buyGoods(ListGoods listBuyedGoods){
                if(listBuyedGoods != null){
                    System.out.println(listBuyedGoods + " is buyed");
                }
            }
        }


