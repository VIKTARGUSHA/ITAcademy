package by.academy.HomeWork.Loops;

//31. Имеется кусок ткани длинной M метров. От него последовательно отрезаются куски равной длины.
// Все данные по использованию ткани заносятся в компьютер. Компьютер должен выдать сообщение о том,
// что материала не хватает, если будет затребован кусок ткани больше длины, чем имеется.
public class LoopsTask31 {
    public static void main(String[] args) {
        double m = 101;
        double lengthOfPeace = 8;
        System.out.print(m);
        while (m >= lengthOfPeace){

            m -= lengthOfPeace;
            System.out.print(" " + m);
        }
        System.out.println();
        if ( m < lengthOfPeace || m == 0){
            System.out.println("There is lack of cloth");
        }
    }
}
