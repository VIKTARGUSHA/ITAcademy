package by.academy.HomeWork.Loops;

//21. Дано натуральное n. вычислить 1/(2 в квадрате) + 1/(4 в квадрате)+ ... + 1/(2n в квадрате) ( в квадрате только n)
//        1,2,3,4,5...n
//        2,4,6,8,10...2n
public class LoopsTask21 {
    public static void main(String[] args) {
int n = 4;
double d = 0;
int divider = 2;
while (Math.pow(divider,2) <= 2 * Math.pow(n,2)) {
    d += 1 / Math.pow(divider, 2);
    divider += 2;
}
        System.out.println(d);
    }
}
