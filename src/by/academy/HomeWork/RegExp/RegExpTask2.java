package by.academy.HomeWork.RegExp;

//2. Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//        учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//        текста также могут быть пробелы, но могут и отсутствовать.
public class RegExpTask2 {
    public static void main(String[] args) {
        String s =" Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно   b  b b";
        String sTwo = s.replaceAll("\s+", " ").trim();
        String [] sThree = sTwo.split(" ");
        System.out.println(sThree.length);
    }
}
