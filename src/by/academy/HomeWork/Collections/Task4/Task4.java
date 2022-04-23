package by.academy.HomeWork.Collections.Task4;

import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        int counterMilk = 0;
        int counterBread = 0;
        int counterVine = 0;
        int counterCake = 0;
        int counterSeafood = 0;
        int counterMeat = 0;
        int counterFish = 0;
        int counterOrange = 0;
        int counterGreipFruit = 0;
        int counterPotato = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("Milk", ++counterMilk);
        map.put("Bread", ++counterBread);
        map.put("Vine", ++counterVine);
        map.put("Cake", ++counterCake);
        map.put("Seafood", ++counterSeafood);
        map.put("Meat", ++counterMeat);
        map.put("Fish", ++counterFish);
        map.put("Orange", ++counterOrange);
        map.put("Bread", ++counterBread);
        map.put("grapefruit", ++counterGreipFruit);
        map.put("Vine", ++counterVine);
        map.put("Potato", ++counterPotato);
        map.put("Fish", ++counterFish);
        System.out.println(map.size());
        System.out.println(map.toString());
    }
}