package by.academy.HomeWork.RegExp;

//4.Напишите два цикла выполняющих многократное сложение строк, один
//        с помощью оператора сложения и String, а другой с помощью StringBuilder
//        и метода append. Сравните скорость их выполнения.
public class RegExpTask4 {
    public static void main(String[] args) {
        String s  = "Напишите ";
        StringBuilder stringBuilder = new StringBuilder(s);
        String additional = "два цикла";
        String add = null;
        for (int i = 0; i < additional.length(); i++){

            if(i == 0) {
               add = s + additional.charAt(i);
                continue;
            }
            add += additional.charAt(i);
        }
        System.out.println(add);
        System.out.println("Now lets doit with StringBuilder");
        for (int j = 0; j < additional.length(); j ++){
            stringBuilder.append(additional.charAt(j));
        }
        System.out.println(stringBuilder);
    }
}
