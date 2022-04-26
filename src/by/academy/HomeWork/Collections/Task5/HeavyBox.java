package by.academy.HomeWork.Collections.Task5;

public class HeavyBox implements Comparable<HeavyBox>{
    private int weight;
    private int number;
    public HeavyBox(int weight, int number){
        this.weight = weight;
        this.number = number;
    }
    @Override
    public int compareTo(HeavyBox o) {
        if(this.weight == o.weight){
            return this.number - o.number;
        }
        return (this.weight - o.weight );
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                '}';
    }
}
