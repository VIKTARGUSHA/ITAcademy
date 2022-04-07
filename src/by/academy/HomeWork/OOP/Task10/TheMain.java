package by.academy.HomeWork.OOP.Task10;

public class TheMain {
    public static void main(String[] args) {
        Shape[] array = new Shape[5];
        array[0] = new Circle();
        array[1] = new Circle();
        array[2] = new Reactangle();
        array[3] = new Reactangle();
        array[4] = new Circle();
        for(Shape s : array){
            s.draw();
        }
    }

}