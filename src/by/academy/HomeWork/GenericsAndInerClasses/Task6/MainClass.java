package by.academy.HomeWork.GenericsAndInerClasses.Task6;

public class MainClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        JenerickClass jK = new JenerickClass( 'm', animal , 8.0f);
        jK.getNames(jK);
    }
}
