package by.academy.HomeWork.Interfaces.Task4;

public enum Sizes {
    XXS{
        @Override
        void getDiscription(Sizes s){
            System.out.println("It's a size for child");
        }
    },
     XS, S, M, L;
    int EVROSIZE;
    void getDiscription(Sizes s){
            System.out.println("It's an adult size");
    }
 Sizes(){
}
Sizes(int i) {
this.EVROSIZE = i;
}
}


