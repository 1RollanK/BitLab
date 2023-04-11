public class Players {
    String name;
    double price;
    int age;

    public Players () {

    }

    public Players (String name, double price, int age){
        this.name = name;
        this.price = price;
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public void setName () {
        this.name = name;
    }

    public double getPrice () {
        return price;
    }

    public void setPrice () {
        this.price = price;
    }

    public int getAge () {
        return age;
    }

    public void setAge () {
        this.age = age;
    }
}
