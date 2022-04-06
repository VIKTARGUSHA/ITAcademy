package by.academy.HomeWork.OOP.Task6;

public class CreateArray {
    public static void main(String[] args) {
        Student[] array = new Student[7];
        array[0] = new Aspirant();
        array[1] = new Student(5);
        array[2] = new Student(4);
        array[3] = new Aspirant("How i spent my sammer", 5);
        array[4] = new Aspirant("culture of sex relations in the countryside");
        array[5] = new Student();
        array[6] = new Student(3);
        for (Student s : array){
            System.out.println(s.averageMark + " " + s.getScoolarship());
        }
    }
}
