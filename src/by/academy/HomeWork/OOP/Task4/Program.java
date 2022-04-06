package by.academy.HomeWork.OOP.Task4;

public class Program {
    public static void main(String[] args) {
        Book [] books = new Book[5];
        books[0] = new Book("Chehov", "Hirurg");
        books[1] = new Book("Remark", "Life in debt");
        books[2] = new Book("Karatkevic", "Ears under your sickle");
        books[3] = new Book("Ivan Meleg", "Podih navalnicy");
        books[4] = new Book("Gofman", "Worldly views of the cat murra");
        Reader jonh = new Reader("Jonh", 123, "EF", "22.02.2002",22322232);
        Reader nick = new Reader("Nick", 124, "FE", "30.03.2003", 22834267);
        Reader mike = new Reader("Mike", 125, "MF", "01.01.2001", 237327273);
        Reader [] readers = new Reader[3];
        readers[0] = jonh;
        readers[1] = nick;
        readers[2] = mike;
        jonh.returnBook(4);
        readers[0].returnBook("Chehov", books[3].getBookName(),books[4].getBookName());
        nick.returnBook(books[1], books[2]);
        nick.takeBook(5);
        readers[1].takeBook("Gofman", "Ivan Meleg", "Karatkevic");
        readers[2].takeBook(books[1], books[2], books[4], books[3]);

    }
}
