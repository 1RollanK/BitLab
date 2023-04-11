public class Main {
    public static void main(String[] args) {

        Gymnast gymnast1 = new Gymnast("Alex Smith", 24, "USA", 170, 70, "Artistic");
        Gymnast gymnast2 = new Gymnast("Maria Garcia", 22, "Spain", 165, 50, "Rhythmic");
        Gymnast gymnast3 = new Gymnast("Yoshi Tanaka", 20, "Japan", 175, 65, "Trampoline");

        Footballer footballer1 = new Footballer("David Silva", 31, "Spain", "Midfielder", "Manchester City");
        Footballer footballer2 = new Footballer("Neymar Jr.", 25, "Brazil", "Forward", "Paris Saint-Germain");
        Footballer footballer3 = new Footballer("Cristiano Ronaldo", 36, "Portugal", "Forward", "Manchester United");

        Swimmer swimmer1 = new Swimmer("Sarah Johnson", 27, "USA", "Freestyle", 50.23);
        Swimmer swimmer2 = new Swimmer("Michael Phelps", 36, "USA", "Butterfly", 49.82);
        Swimmer swimmer3 = new Swimmer("Sun Yang", 29, "China", "Freestyle", 47.84);

        Sportsman[] sportsmanList = {gymnast1, gymnast2, gymnast3, footballer1, footballer2, footballer3, swimmer1, swimmer2, swimmer3};

        OlympicGames olympicGames = new OlympicGames("Tokyo", 2021, sportsmanList);

        olympicGames.play();
    }
}