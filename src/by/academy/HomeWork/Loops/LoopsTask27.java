package by.academy.HomeWork.Loops;

//27. У первокласника пети m рублей.Мороженое стоит k рублей. Петя решил наесться досыта мороженого
// , для этого он покупал по одному мороженому и съедал его до тех пор, пока ему хватало денег.
// Как пете узнать, сколько денег останется у него в конце концов? учтите, что петя делить еще не умеет
// , а умеет только вычитать и складывать. сколько мороженых он может съесть?.

public class LoopsTask27 {
    public static void main(String[] args) {
        double m = 100;
        double k = 6;
        double x = m;
        int counter = 0;
        while ( x >= k){
           x -= k;
           counter++;
        }
        System.out.println(counter);
    }
}
