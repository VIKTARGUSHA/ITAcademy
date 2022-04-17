package by.academy.HomeWork.GenericsAndInerClasses.Task5;

public class MainClass {
    public static void main(String[] args) {
        Cookable cookable = new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("I'm cooking " + str);
            }
        };
        Food food = new Food();
        food.prepare(cookable, "seafoods"  );
    }
}
