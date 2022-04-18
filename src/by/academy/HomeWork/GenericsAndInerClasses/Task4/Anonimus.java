package by.academy.HomeWork.GenericsAndInerClasses.Task4;

public class Anonimus {
    public static void main(String[] args) {

    Printable printable = new Printable() {
        @Override
        public void print() {
            System.out.println("Hello nested class");
        }
    };
    printable.print();
    SimpleClass s = new SimpleClass(){
        @Override
        public void print(){
            System.out.println("I'm a class anonim");
        }
    };
    s.print();
    }
}
