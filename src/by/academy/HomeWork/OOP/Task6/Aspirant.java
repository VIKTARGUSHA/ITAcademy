package by.academy.HomeWork.OOP.Task6;

public class Aspirant extends Student{
    String scientifiWork;
    public Aspirant(){
    }
    public Aspirant(String work){
        scientifiWork = work;
    }
    public Aspirant(String work, int averageMarks){
        scientifiWork = work;
        averageMark = averageMarks;
    }
    @Override
    public int getScoolarship() {
        if(averageMark == 5){
            return 200;
        }else return 180;
    }
}
