package by.academy.HomeWork.Strings;

import java.util.Scanner;

//5. Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского
//        алфавита, а среди них – количество слов с равным числом гласных и согласных букв.
public class StringsTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n  = sc.nextInt();
            String[] array = new String[n];
            int counterWords = 0;
            int counterNumbers = 0;

        for (int i = 0; i < n; i++){
            String s1= sc.next();
            String s = s1.replaceAll("[^a-zA-Z]", "");
            if (s1.length() == s.length()){
                array[i] = s1;
                counterWords++;
            }
        }
        System.out.println("Number words with only latin letter: " + counterWords);

        for (String str : array){
            int numberHonest = 0;
            int numberOdd = 0;
            if (str != null) {
                char[] arrayChar = str.toCharArray();
                for (int j = 0; j < str.length(); j++) {
                    if (arrayChar[j] == 'e' || arrayChar[j] == 'y' || arrayChar[j] == 'u' || arrayChar[j] == 'i'
                            || arrayChar[j] == 'o' || arrayChar[j] == 'a'){
                        numberHonest++;
                    }
                    if (!(arrayChar[j] == 'e' || arrayChar[j] == 'y' || arrayChar[j] == 'u' || arrayChar[j] == 'i'
                            || arrayChar[j] == 'o' || arrayChar[j] == 'a')){
                        numberOdd ++;
                    }
                }
                }else continue;
            if (numberHonest == numberOdd){
                counterNumbers++;
            }
        }
        System.out.println(" Number words with equal amount of odd and honest letters: " + counterNumbers);
    }
}
