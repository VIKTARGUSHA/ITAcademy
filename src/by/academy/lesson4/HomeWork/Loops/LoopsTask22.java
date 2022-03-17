package by.academy.lesson4.HomeWork.Loops;

// 22. дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
public class LoopsTask22 {
    public static void main(String[] args) {
        int n = 4;
        double counter = 1;
        for (int i = 2; i <= n; i++){
            counter += 1/(double)i;
        }
        System.out.println(counter);
    }
}
