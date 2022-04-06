package by.academy.HomeWork.OOP.Task6;

public class Student {
    protected String firstName;
    protected String lastName;
    protected String group;
    double averageMark;
    int y =3;
   //Student student = new Aspirant();
    //Student student1 = new Student();
    public Student(int averMark){
        averageMark = averMark;
    }

   public Student(){
   }
    public int getScoolarship(){
        if(averageMark == 5){
            return 100;
        }else return 80;
    }
}
