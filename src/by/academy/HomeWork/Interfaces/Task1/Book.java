package by.academy.HomeWork.Interfaces.Task1;

public class Book implements PrintAble{

    @Override
    public void print() {
        System.out.println("Buy book");
    }
    public static void printBooks(PrintAble [] printAbles){
        for(PrintAble p : printAbles){
            if(p instanceof Book){
                System.out.println("Book is printed");
            }
        }
    }
}
