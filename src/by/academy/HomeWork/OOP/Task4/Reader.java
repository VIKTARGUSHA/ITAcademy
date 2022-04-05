package by.academy.HomeWork.OOP.Task4;

public class Reader {
    protected String fio;
    protected int numberOfReader;
    protected String facultet;
    protected String dateOfBorn;
    protected int telephoneNumber;

    public Reader(String fio, int numberOfReader, String facultet, String dateOfBorn, int telephoneNumber){
        this.fio = fio;
        this.numberOfReader = numberOfReader;
        this.facultet = facultet;
        this.dateOfBorn = dateOfBorn;
        this.telephoneNumber = telephoneNumber;
    }
    public void takeBook(int quantity){
        System.out.println(fio + " took " + quantity + " books");
    }
    public void takeBook(){

    }
    public void returnBook(){

    }
    public void takeBook(String ... nameBook){
        System.out.println(fio + " took the next books: ");
        int k = 0;
        for (String s : nameBook){
            if(k < nameBook.length -1){
                System.out.print(s + " ,");
                k++;
            }else System.out.print(s + "\n");
        }
    }
    public void takeBook(Book ... book){
        System.out.println(fio + " took the next books: ");
        for (Book b : book){
            System.out.print(b.getBookName() + ", ");
        }
    }
    public void returnBook(int quantity){
        System.out.println(fio + " returned " + quantity + " books");
    }
    public void returnBook(String ... nameBook) {
        System.out.println(" " + fio + " return the next books: ");
        int n = 0;
        for (String s : nameBook) {
            if (n < nameBook.length - 1) {
                System.out.print(s + ", ");
            } else {
                System.out.print(s);
            }
        }
        System.out.print("\n");
    }
    public void returnBook(Book ... book){
        System.out.println(" " + fio + " return the next books: ");
        for (Book b : book){
            System.out.print(b.getBookName() + ", ");
        }
    }


}
