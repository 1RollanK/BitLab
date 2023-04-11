public class Player {
    int number;
    String name;
    String surname;
    String position;

    public Player(){
        this.number = 0;
        this.name = "";
        this.surname = "";
        this.position = "";
    }

    public Player(int number, String name, String surname, String position){
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public String toString (){
        return "Number: " + number + ". Name: " + name + ". Surname: " + surname + ". Position: " + position;
    }
}


