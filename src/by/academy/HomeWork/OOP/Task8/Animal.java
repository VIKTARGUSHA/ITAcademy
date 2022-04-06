package by.academy.HomeWork.OOP.Task8;

public class Animal {
   private String food;
   protected String location;
   public Animal(){

   }
    public Animal(String food, String location){
        this.food = food;
        this.location = location;
    }
    public void makeNoise(){
        System.out.println("Animal make noise");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
    public void sleep(){
        System.out.println("Animal sleeps");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
