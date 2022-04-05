package by.academy.HomeWork.OOP.Task4;

public class Book {
    private String authorName;
    private String bookName;

    public Book(String authorName, String bookName){
        this.authorName = authorName;
        this.bookName = bookName;
    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
