package by.academy.HomeWork.OOP.Task10;

public abstract class Shape {
    String color;
    public abstract void draw();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
