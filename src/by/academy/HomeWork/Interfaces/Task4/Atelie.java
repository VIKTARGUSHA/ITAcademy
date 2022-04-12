package by.academy.HomeWork.Interfaces.Task4;

public class Atelie {
public static void putOnMans(Clothes [] c){
    for (Clothes cl : c){
        cl.putOnMen();
    }
}
    public static void putOnWomans(Clothes [] c){
        for (Clothes cl : c){
            cl.putOnWomen();
        }
    }
    public static void main(String[] args) {
        Clothes [] clothesArray = new Clothes[5];
        clothesArray[0] = new Skirt(22, 100, "Red");
        clothesArray[1] = new Tie(10, 50, "White");
        clothesArray[2] = new Tresuares(25, 150, "Yellow");
        clothesArray[3] = new TShirt(34, 120, "Blue");
        clothesArray[4] = new Skirt(32, 250, "Green");
        for (Clothes closes : clothesArray){
            closes.putOnWomen();
            closes.putOnMen();

        }
    }
}
