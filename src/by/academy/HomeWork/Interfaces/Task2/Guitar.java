package by.academy.HomeWork.Interfaces.Task2;

public class Guitar implements Tool{
    protected int numberOfStrings;
public Guitar(int n ){
    numberOfStrings =n;
}
    @Override
    public void play() {
        System.out.println("The guitar is played with numberOf Strings " + numberOfStrings);
    }
}
