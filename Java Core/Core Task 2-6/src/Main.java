public class Main {
    public static void main(String[] args) {
        Player[] players1 = {new Player(1, "John", "Smith", "Forward"), new Player(2, "Mary", "Johnson", "Midfielder"),
                new Player(3, "David", "Brown", "Defender"), new Player(4, "Anna", "Taylor", "Forward"),
                new Player(5, "Michael", "Anderson", "Goalkeeper")};

        Player[] players2 = {new Player(1, "Jessica", "Wilson", "Forward"), new Player(2, "Robert", "Miller", "Midfielder"),
                new Player(3, "Emily", "Davis", "Defender"), new Player(4, "Jacob", "Martinez", "Forward"),
                new Player(5, "Ava", "Garcia", "Goalkeeper")};

        Club club1 = new Club("Club 1", "Country 1", 100, players1);
        Club club2 = new Club("Club 2", "Country 2", 200, players2);

        Club[] clubs = {club1, club2};

        for (int i = 0; i < clubs.length; i++) {
            clubs[i].printClubData();
        }
    }
}

