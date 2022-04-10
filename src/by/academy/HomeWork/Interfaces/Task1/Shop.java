package by.academy.HomeWork.Interfaces.Task1;

public class Shop {
    public static void main(String[] args) {
        PrintAble[] printAbles = new PrintAble[3];
        printAbles[0] = new Book();
        printAbles[1] = new Magazine();
        printAbles[2] = new Book();
        for (PrintAble p : printAbles){
            p.print();
        }
        Magazine.printMagazins(printAbles);
        Book.printBooks(printAbles);
    }
}
