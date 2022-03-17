package by.academy.lesson4.HomeWork.Loops;

//5. Составьте программы перевода старинных русских мер длины, торгового и аптекарского веса(счетчик цикла от 1 до 10)
//        * саженей в метры(1 сажень равна 2,1366 м)
//        * из дюймов в сантиметры(1 дюйм равен 2,5 см)
//        * футов в метры(1 фут равен 0,3048 м)
//        * драхм в граммы(1 драхма равна 3,7325 г)
//        * унций в граммы(1 унция равна 29,86 г)
//        * фунтов в килограммы(1 фунт равен 0,40951 кг)
//        * аршинов в метры(1 аршин равен 0,7112 м)
//        * золотников в граммы(1 золотник равен 4,2657 г)
//        * дюймов в миллиметры(1 дюйм равен 25,3995 мм)
public class LoopsTask5 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++){
            double sajenMetr = 2.1366 * i;
            double duim = 2.5 * i;
            double fut = 0.3048 * i;
            double drahm = 3.7325 *i;
            double unciy = 29.86 * i;
            double funt = 0.40951 * i;
            double arshin = 4.2657 * i;
            double zolotnik = 4.2657 * i;
            double duimMm = 25.3995 * i;
            System.out.println(i);
            System.out.println("sajen = " + sajenMetr +" " + "m" + "\n" + "duim = " + duim + " " + "cm"
            + "\n" + "fut = " + fut + " m" + "\n" + "drahm = " + drahm + " " + "г" + "\n"
            +"unciya = " + unciy + " г" + "\n" + "funt = " + funt + " кг" + "\n"
            +"arshin = " + arshin + " m" + "\n" + "zolotnik = " + zolotnik + " г" + "\n"
            + "duim = " + duimMm + " mm" );

        }
    }
}
