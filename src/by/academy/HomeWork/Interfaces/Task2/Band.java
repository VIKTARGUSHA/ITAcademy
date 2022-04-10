package by.academy.HomeWork.Interfaces.Task2;

public class Band {
    public static void main(String[] args) {
        Tool [] tool = new Tool[5];
        tool[0] = new Dram(1000);
        tool[1] = new Guitar(6);
        tool[2] = new Pipe(15);
        tool[3] = new Pipe(13);
        tool[4] = new Dram(50);
        for (Tool t : tool){
            t.play();
        }
    }
}
