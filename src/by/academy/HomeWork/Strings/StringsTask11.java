package by.academy.HomeWork.Strings;

//11. Используя оператор switch, написать программу,
//        которая выводит на экран сообщения о принадлежности некоторого значения k интервалам
//        (-10k, 5], [0, 10], [5, 15], [10, 10k].
public class StringsTask11 {
    public static void main(String[] args) {
       int k = (int)(Math.random()*30-15);
        System.out.println(k);
        switch(Boolean.compare((k <= 5), true)){
            case 0 :
                if(k < 0) {
                    System.out.println("k came from (-10k, 5]");
                    return;
                }
                else if(k == 5){
                    System.out.println("k came from (-10k, 5] and [0, 10] and [5 , 15]");
                    return;
                }
                else {
                    System.out.println("k came from (-10k, 5] and [0, 10]");
                    return;
                }
            case -1 :
                if(k < 10){
                    System.out.println("k came from [0 , 10] and [5 , 15]");
                }
                else if(k == 10){
                    System.out.println("k came from [0 , 10] and [5 , 15] and [10 , 10k]");
                }
                else if (k > 10 && k <=15 ){
                    System.out.println("k came from [5 , 15] and [10 , 10k]");
                }
                else System.out.println("k came from [10 , 10k]");
        }

    }
}
