package by.academy.HomeWork.Interfaces.Task3;

public class forSeasons {
    public static void main(String[] args) {

        Seasons s = Seasons.SAMMER;
        System.out.println(s.AVERAGETEMPERATURE + " " + s.getDiscription());
        for (Seasons season : Seasons.values()){
            System.out.println(season + " " + season.AVERAGETEMPERATURE + " " + season.getDiscription());
            season.currentSeason();
        }
    }
}