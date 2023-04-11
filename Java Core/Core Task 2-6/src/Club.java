public class Club {
    String name;
    String country;
    int ratingPoints;
    Player[] players;

    public Club () {
        this.name = "";
        this.country = "";
        this.ratingPoints = 0;
        this.players = new Player[0];
    }

    public Club (String name, String country, int ratingPoints, Player[] players){
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players = players;
    }

    public void printClubData(){
        System.out.println("Club name: " + name + ". Country: " + country + ". Rating points: " + ratingPoints);
        System.out.println("Players:");
        for(int i = 0; i < players.length; i++){
            System.out.println(players[i].toString());
        }
    }
}
