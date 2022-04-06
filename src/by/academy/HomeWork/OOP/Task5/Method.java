package by.academy.HomeWork.OOP.Task5;

public class Method {
    private static int recursionMethod(int x, int y){
        if(x < y) {
            System.out.print(" " + x++);
        }else if(x > y) {
            System.out.print(" " + x--);
        }else {
            System.out.print(" " + y);
            return y;}
        return recursionMethod(x, y);
        }

    public static void main(String[] args) {
        int a = (int)(Math.random()*100);
        int b = (int)(Math.random()*100);
        System.out.println(a + " " + b);
        if (a > b){
            recursionMethod(a, b);
        }else {
            recursionMethod(a, b);
        }
    }
}
