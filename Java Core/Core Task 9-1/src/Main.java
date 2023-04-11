import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Players> playersList = new ArrayList<>();
        playersList.add(new Players("John", 100000, 25));
        playersList.add(new Players("Mike", 150000, 28));
        playersList.add(new Players("Anna", 80000, 23));
        playersList.add(new Players("David", 200000, 31));
        playersList.add(new Players("Alice", 120000, 27));
        playersList.add(new Players("Peter", 90000, 24));
        playersList.add(new Players("Kate", 170000, 29));
        playersList.add(new Players("Bob", 110000, 26));
        playersList.add(new Players("Mary", 75000, 22));
        playersList.add(new Players("Tom", 180000, 30));

        double sumPrice = 0;
        int sumAge = 0;

        for(Players player: playersList){
            sumPrice += player.getPrice();
            sumAge += player.getAge();
        }

        double averagePrice = sumPrice / playersList.size();

        System.out.println("Average price: " + averagePrice);
        System.out.println("Sum of ages: " + sumAge);
    }
}