package by.academy.HomeWork.Interfaces.Task3;

public enum Seasons {

    WINTER(-20),
    SPRING(5),
    AUTUMN(-5),
    SAMMER(30) {
        @Override
        String getDiscription() {
            return "It's a warm type of year";
        }
    };

        double AVERAGETEMPERATURE;

        Seasons(double averageTemperature) {
            AVERAGETEMPERATURE = averageTemperature;
        }

        String getDiscription() {
            return "It's a cold time of year";
        }

        void currentSeason() {
            switch ((int) AVERAGETEMPERATURE) {
                case -5 -> System.out.println("Autumn is no good");
                case -20 -> System.out.println("Winter is already better");
                case 5 -> System.out.println("Spring is current season");
                case 30 -> System.out.println("I like summer");
            }
        }
    }

