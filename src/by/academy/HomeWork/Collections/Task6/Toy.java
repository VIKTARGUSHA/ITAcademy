package by.academy.HomeWork.Collections.Task6;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Toy {
    String name;
    public Toy(String name){
        this.name = name;
    }
    public static void entryset(Map<String, Toy> hM){
        Set<Map.Entry<String, Toy>> entrySet = hM.entrySet();
        for (Map.Entry<String, Toy> set : hM.entrySet()){
            System.out.print(set + " ");
        }
        System.out.println();
    }
    public static void keySet(Map<String, Toy> hM) {
        for (String key : hM.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();
    }
    public static void values(Map<String, Toy> map){
        for (Toy toy : map.values()){
            System.out.print(toy + " ");
        }
    }
    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                '}';
    }
}
