public class OlympicGames {
    String city;
    int year;
    Sportsman[] sportsmanList;

    public OlympicGames(String city, int year, Sportsman[] sportsmanList) {
        this.city = city;
        this.year = year;
        this.sportsmanList = sportsmanList;
    }

        public void play() {
            for (Sportsman sportsman : sportsmanList) {
                sportsman.play();
            }
        }
    }

