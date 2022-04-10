package by.academy.HomeWork.Interfaces.Task2;

public class Pipe implements Tool{
  protected double diametr;
public Pipe(double d){
    diametr =d;
}
   @Override
    public void play() {
       System.out.println("The pipe is making music with diametr " + diametr);
    }
}
