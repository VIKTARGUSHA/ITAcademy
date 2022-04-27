package by.academy.HomeWork.Collections.Task6;

import java.util.HashMap;
import java.util.Map;

public class ToySet {
    public static void main(String[] args) {

        Map<String, Toy> map = new HashMap<>();
        map.put("Soldier", new Toy("Soldier"));
        map.put("Car", new Toy("Car"));
        map.put("Gun", new Toy("Gan"));
        map.put("House", new Toy("House"));
        map.put("Bycicle", new Toy("Bycicle"));
        Toy.entryset(map);
        Toy.keySet(map);
        Toy.values(map);
    }
}