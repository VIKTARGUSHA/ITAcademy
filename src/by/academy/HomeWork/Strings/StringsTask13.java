package by.academy.HomeWork.Strings;

//13. Написать программу, позволяющую корректно находить корни квадратного уравнения.
// Параметры уравнения должны задаваться с командной строки.
public class StringsTask13 {
    public static void main(String[] args) {

        double a = Integer.parseInt(args[0]);
        System.out.println(a);

        double b = Integer.parseInt(args[1]);
        System.out.println(b);

        double c = Integer.parseInt(args[2]);
        System.out.println(c);

        double d = Math.pow(b , 2) -4 * a * c;
        double x;

        if (d < 0){
            System.out.println("Equation doesn't have solutions");
        }
        if (d == 0){
            x = -b/2*a;
            System.out.println("Equation has one solution: " + x);
        }
        if (d > 0){
            x = (-b + Math.pow(d, 0.5))/(2 * a);
            System.out.println("Equation has two solutions" + "\n" + "first solution:" + x);
            x = (-b - Math.pow(d , 0.5))/(2 * a);
            System.out.println("second solution: " + x);
        }
        System.out.println(d);
    }
}
