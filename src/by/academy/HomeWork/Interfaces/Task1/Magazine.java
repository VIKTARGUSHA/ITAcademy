package by.academy.HomeWork.Interfaces.Task1;

public class Magazine implements PrintAble {
    @Override
    public void print() {
        System.out.println("Buy Magazine");
    }
    public static void printMagazins(PrintAble[] printAbles) {
        for (PrintAble p : printAbles) {
            if (p instanceof Magazine ){
                System.out.println("Magazine is printed");
            }
        }
    }
}