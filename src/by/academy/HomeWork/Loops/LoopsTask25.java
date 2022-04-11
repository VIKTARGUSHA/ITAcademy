package by.academy.HomeWork.Loops;

//25. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
public class LoopsTask25 {
    public static void main(String[] args) {
        double a = 5;
        int n = 7;
        int x = 2;
        double total = a*(a+1);
        while (x < n){
            total *= (a+x);
            x++;
        }
        System.out.println(total);
    }
}
